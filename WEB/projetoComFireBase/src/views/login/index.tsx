import Formmulario from '../../components/formulario'
import usuarioDbService from '../../services/usuario/usuarioDbService.ts'
import { useNavigate } from 'react-router-dom';

function login() {
  const navegar = useNavigate();
  async function handleLoginSubmit(email: string, senha: string) {
    const login =  await usuarioDbService.fazerLogin(email, senha);
    if(login){  
      navegar('/homeLogada');
    }
  }
  return (
    <>
        <Formmulario onSubmit={handleLoginSubmit} buttonText="Entrar" buttonText2='Cadastrar' logarOuCadastrar='/cadastrar'/>
    </>
  )
}

export default login