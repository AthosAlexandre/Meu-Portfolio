<template>
    <v-container>
        <h2 style="text-align: center;">Devolução de Jogos</h2>
        <main class="container">
            <v-card>
                <v-card-title>Usuarios</v-card-title>
                <v-table>
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Numero</th>
                            <th>Games Locado</th>
                            <th>Devolver</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="(usuario, index) in usuarios" :key="index">
                            <td>{{ usuario.nome }}</td>
                            <td>{{ usuario.telefone }}</td>
                            <td v-if="usuario.games !=null">{{ usuario.games.nome }}</td>
                            <td v-else>Sem Jogo Locado</td>
                            <td v-if="usuario.games !=null"> <v-btn @click="devolverGame(usuario.id,usuario.games.id)" append-icon="mdi-arrow-left">DEVOLVER</v-btn>
                            </td>
                            <td v-else><v-btn append-icon="mdi-arrow-left">DEVOLVER</v-btn>
                            </td>
                        </tr>
                    </tbody>
                </v-table>
            </v-card>
        </main>
    </v-container>
</template>

<script>
import axios from 'axios';

export default {
    name: "DevolverJogosView",
    data() {
        return {
            usuarios: []
        }
    },
    methods: {
        async pegarUsuarios() {
            try {
                const user = await axios.get('http://localhost:8080/usuarios');
                console.log("Deu certo")
                this.usuarios = user.data.content;
                console.log(this.usuarios);
            } catch (erro) {
                console.log('Deu erro ', erro)
            }
        },
        async devolverGame(idUsuario,idGame) {

            await axios.put('http://localhost:8080/usuarios', {
                "id": idUsuario,
                "game": null,
            }).then(resposta => {
                console.log("Deu certo do usuario ", resposta.data);
            }).catch(erro =>{
                console.log("Deu erro ", erro.data)
            });

            await axios.put('http://localhost:8080/games',{
                "id":idGame,
                "locado":0
            }).then( resposta =>{
                console.log("Deu certo do game ", resposta.data);
                
                setTimeout(() => {
                    location.reload();
                }, 3000);

            });
        },
    },
    async created() {
        await this.pegarUsuarios();
    },
}
</script>

<style scoped>
.container {
    width: 900px;
    max-width: 100%;
    margin: 0 auto;
    padding-top: 20px;
}
</style>