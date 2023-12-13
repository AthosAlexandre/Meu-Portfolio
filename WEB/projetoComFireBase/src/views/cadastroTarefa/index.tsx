import React, { useState } from 'react';
import usuarioDbService from '../../services/usuario/usuarioDbService.ts';
import './cadastroTarefa.css';
import { Link } from 'react-router-dom';
import { ListaDeTarefasInterface } from '../../interfaces/listaDeTarefasInterface.ts';
import { useNavigate } from 'react-router-dom';
function cadastroTarefa() {
  const navegar = useNavigate();
  const [tarefas, setTarefas] = useState(''); // Inicialização correta
  const [data, setData] = useState(''); // Inicialização correta

  const atualizarEstadoValor = (event: React.ChangeEvent<HTMLInputElement>)  => {
    setTarefas(event.target.value);
  }

  const atualizarEstadoData = (event: React.ChangeEvent<HTMLInputElement>)  => {
    setData(event.target.value);
  }

  const enviarTarefa = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    console.log(tarefas);
    console.log(data);
    let tarefa:Array<ListaDeTarefasInterface> = [];
    tarefa.push({
    datetime: new Date(data).getUTCDate() + '/'+'0' + (1+parseInt(new Date(data).getMonth())) + '/' + new Date(data).getUTCFullYear(),
    tarefa: tarefas,
   });
    usuarioDbService.cadastrarLista(tarefa);
    navegar('/homeLogada');
  }

  return (
    <div className='container-tarefa'>
      <div className="mine-cabecalho">
        <h1>Cadastro de Tarefa</h1>
        <Link className='btn btn-outline-info' to={'/homeLogada'}>Voltar</Link>
      </div>
      <form action="" onSubmit={enviarTarefa}>
        <div className="form-floating ">
          <textarea value={tarefas} onChange={atualizarEstadoValor} className="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style={{height: "100px"}}></textarea>
          <label htmlFor="floatingTextarea2">Comments</label>
        </div>
        <div className="data">
          <input value={data} onChange={atualizarEstadoData} type="date" name="" id="" />
        </div>
        <div className="enviar-tarefa">
          <button className='btn btn-primary'>Enviar</button>
        </div>
      </form>
    </div>
  )
}

export default cadastroTarefa