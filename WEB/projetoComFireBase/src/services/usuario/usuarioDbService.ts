import db from "../../plugins/firestore";
import auth from "../../plugins/firebase-auth.ts";
import { setPersistence, browserSessionPersistence, signInWithEmailAndPassword, createUserWithEmailAndPassword, onAuthStateChanged, User, signOut } from "firebase/auth";
import { collection, getDocs, doc, getDoc, addDoc, setDoc } from "firebase/firestore";
import { ListaDeTarefasInterface } from "../../interfaces/listaDeTarefasInterface.ts";
class UsuarioDbService {

    async fazerLogin(email: string, senha: string): Promise<boolean> {
        try {
            const result = signInWithEmailAndPassword(auth, email, senha)
            const retorno = await this.isUsuarioExistente((await result).user.uid);
            if (retorno === true) {
                console.log("Usuário existe");

                return true;
            } else {
                console.log("Usuário não existe")
                return false;
            }
        } catch (e) {
            console.log("Erro ao fazer login: " + e);
            return false;
        }

    }

    persistirLogin(email: string, password: string) {
        setPersistence(auth, browserSessionPersistence)
            .then(() => {
                // Existing and future Auth states are now persisted in the current
                // session only. Closing the window would clear any existing state even
                // if a user forgets to sign out.
                // ...
                // New sign-in will be persisted with session persistence.
                return signInWithEmailAndPassword(auth, email, password);
            })
            .catch((error) => {
                // Handle Errors here.
                const errorCode = error.code;
                const errorMessage = error.message;
            });
    }

    async isUsuarioExistente(uid: any): Promise<any> {
        const docRef = doc(db, "usuarios", uid);
        const docSnap = await getDoc(docRef);
        const result = docSnap.exists();
        return result;
    }

    async criarUsuario(email: string, senha: string) {

        const seExiste = await this.fazerLogin(email, senha);

        if (seExiste === true) {
            console.log("Usuário já existe");
        } else {
            console.log("Usuário não existe");
            await createUserWithEmailAndPassword(auth, email, senha)
                .then((userCredential) => {
                    // Signed in 
                    const user = userCredential.user;
                    console.log("Cadastro realizado com sucesso, novo usuario: " + user.uid);
                    this.cadastrarUsuarioNoBancoDeDados(user.uid, email);
                    // ...
                })
                .catch((error) => {
                    const errorCode = error.code;
                    const errorMessage = error.message;
                    console.log(errorCode + " - " + errorMessage)
                    // ..
                });
        }
    }

    async cadastrarUsuarioNoBancoDeDados(uid: string, email: string) {
        try {
            const docRef = doc(db, 'usuarios', uid);
            await setDoc(docRef, {
                uid: uid,
                email: email
            })
            console.log("Cadastrado no banco com sucesso ", docRef.id);
        } catch (e) {
            console.error("Error adding document: ", e);
        }
    }

    async verUsuarioLogado(): Promise<string> {
        return new Promise<string>((resolve, reject) => {
            const unsubscribe = onAuthStateChanged(auth, (user: User | null) => {
                unsubscribe(); // Remove the listener to prevent memory leaks
                if (user) {
                    resolve(user.email || '');
                } else {
                    resolve('');
                }
            }, reject);
        });
    }

    deslogarUsuario() {
        signOut(auth).then(() => {
            // Sign-out successful.
            console.log('Usuário deslogado');
        }).catch((error) => {
            // An error happened.
            console.log('Erro ao deslogar usuário');
        });
    }

    async listaDeTarefas() {
        const tarefas: Array<ListaDeTarefasInterface> = [];
        const querySnapshot = await getDocs(collection(db, "tarefas"));
        let numeroLista = 0;
        querySnapshot.forEach((doc) => {
            const tarefaData = doc.data() as ListaDeTarefasInterface;
            numeroLista++;
            tarefas.push(this.interfaceDaListaDeTarefas(tarefaData, doc.id, numeroLista));
        });
        return tarefas;
    }

    interfaceDaListaDeTarefas(data: ListaDeTarefasInterface, id: string, numeroDaLista: number): ListaDeTarefasInterface {
        return {
            datetime: data.datetime,
            tarefa: data.tarefa,
            id: id,
            numeroLista: numeroDaLista
        }
    }
}

export default new UsuarioDbService();
