import './cadastro.css'
import Formulario from '../../components/formulario';
import UsuarioDbService from '../../services/usuario/usuarioDbService.ts'
function cadastro() {
    async function cadastrarLogin(email: string, senha: string) {
        UsuarioDbService.criarUsuario(email, senha);
    }
    return(
        <>
            <div className="container-form">
                <Formulario onSubmit={cadastrarLogin} buttonText='Cadastrar' buttonText2='Logar' logarOuCadastrar='/'/>
            </div>
        </>
    )
}

export default  cadastro;