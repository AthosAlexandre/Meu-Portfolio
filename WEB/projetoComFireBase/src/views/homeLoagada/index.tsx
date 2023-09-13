import React, { useState, useEffect } from 'react';
import ListaDeTarefas from './../../components/listaDeTarefas/index';
import usuarioDbService from '../../services/usuario/usuarioDbService.ts';
import './homeLogada.css';
import { Navigate, Link } from 'react-router-dom';

function homeLogada() {
  const [email, setEmail] = useState('');

  useEffect(() => {
    async function fetchUsuario() {
      try {
        const userEmail = await usuarioDbService.verUsuarioLogado();
        setEmail(userEmail);
      } catch (error) {
        console.error('Erro ao buscar usuário logado:', error);
      }
    }

    fetchUsuario();
  }, []); // O array vazio [] garante que o efeito seja executado somente uma vez, semelhante ao componentDidMount

  function deslogar(){
    usuarioDbService.deslogarUsuario();
  }
 
  return (
    <>
      <div className='containerUsuario'>
        <div>Olá {email}</div>
        
        <div className="cadastrar-tarefa">
          <Link className='btn btn-primary' to={'/cadastroTarefa'}>Cadastrar Tarefa</Link>
        </div>

        <div className="sair">
          <Link className='btn btn-outline-danger' onClick={deslogar} to={'/'}>Sair</Link>
        </div>
      </div>
      <ListaDeTarefas/>
    </>
  );
}

export default homeLogada;
