import React, { useState, useEffect } from 'react';
import usuarioDbService from '../../services/usuario/usuarioDbService.ts';
import './cadastroTarefa.css';
import { Link } from 'react-router-dom';
function cadastroTarefa() {

  return (
    <div className='container-tarefa'>
      <div className="mine-cabecalho">
        <h1>Cadastro de Tarefa</h1>
        <Link className='btn btn-outline-info' to={'/homeLogada'}>Voltar</Link>
      </div>
      <form action="">
        <div className="form-floating ">
          <textarea className="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style={{height: "100px"}}></textarea>
          <label htmlFor="floatingTextarea2">Comments</label>
        </div>
        <div className="data">
          <input type="date" name="" id="" />
        </div>
        <div className="enviar-tarefa">
          <button className='btn btn-primary'>Enviar</button>
        </div>
      </form>
    </div>
  )
}

export default cadastroTarefa