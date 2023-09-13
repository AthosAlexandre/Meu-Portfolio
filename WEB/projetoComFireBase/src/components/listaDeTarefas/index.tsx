import React, { useEffect, useState } from 'react';
import usuarioDbService from '../../services/usuario/usuarioDbService.ts';
import { ListaDeTarefasInterface } from '../../interfaces/listaDeTarefasInterface.ts';

function listaDeTarefas() {
    const [tarefas, setTarefas] = useState<Array<ListaDeTarefasInterface>>([]); // Inicialização correta

    useEffect(() => {
        const fetchTarefas = async () => {
            try {
                const tarefasData = await usuarioDbService.listaDeTarefas();
                setTarefas(tarefasData);
            } catch (error) {
                console.error('Erro ao buscar tarefas:', error);
            }
        };

        fetchTarefas();
    }, []);

    return (
        <>
            <table className="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Tarefas</th>
                        <th scope="col">Data</th>
                        <th scope="col">Id</th>
                    </tr>
                </thead>
                <tbody>
                    {tarefas.map((tarefa) => (
                        <tr key={tarefa.id}>
                            <th scope="row">{tarefa.numeroLista}</th>
                            <td>{tarefa.tarefa}</td> 
                            <td>{tarefa.datetime.toLocaleString()}</td> 
                            <td>{tarefa.id}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    )
}

export default listaDeTarefas