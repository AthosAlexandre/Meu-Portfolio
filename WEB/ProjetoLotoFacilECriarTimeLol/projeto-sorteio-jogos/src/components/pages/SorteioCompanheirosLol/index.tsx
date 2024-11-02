import React, { useState } from 'react';
import './SorteioCompanheirosLol.css';

export default function SorteioCompanheirosLol() {
  const [teamSize, setTeamSize] = useState('');
  const [playerCount, setPlayerCount] = useState(0);
  const [playerNames, setPlayerNames] = useState([]);
  const [teams, setTeams] = useState([]);

  const handleTeamSizeChange = (event) => {
    const size = event.target.value;
    setTeamSize(size);
    setPlayerCount(size ? parseInt(size.split('x')[0]) + parseInt(size.split('x')[1]) : 0);
    setPlayerNames(Array(parseInt(size.split('x')[0]) + parseInt(size.split('x')[1])).fill(''));
  };

  const handleNameChange = (index, event) => {
    const newNames = [...playerNames];
    newNames[index] = event.target.value;
    setPlayerNames(newNames);
  };

  const handleDrawTeams = () => {
    if (playerNames.some(name => name.trim() === '')) {
      alert("Por favor, preencha todos os nomes dos jogadores.");
      return;
    }

    const shuffledPlayers = [...playerNames].sort(() => Math.random() - 0.5);
    const newTeams = [];

    for (let i = 0; i < teamSize.split('x').length; i++) {
      newTeams.push(shuffledPlayers.slice(i * parseInt(teamSize.split('x')[0]), (i + 1) * parseInt(teamSize.split('x')[0])));
    }

    setTeams(newTeams);
  };

  return (
    <div className='container'>
      <h3 className='display-5 title-page'>Sorteio Companheiros do Lol</h3>

      <div className="container-select">
        <div className="form-group">
          <label htmlFor="teamSizeSelect">Selecione o tamanho do time</label>
          <select className="form-control" id="teamSizeSelect" onChange={handleTeamSizeChange}>
            <option value="">Selecione uma opção</option>
            <option value="3x3">3x3</option>
            <option value="4x4">4x4</option>
            <option value="5x5">5x5</option>
          </select>
        </div>
      </div>

      {teamSize && (
        <div className="player-inputs">
          <h4>Insira os nomes dos invocadores:</h4>
          {Array.from({ length: playerCount }, (_, index) => (
            <div key={index} className="form-group">
              <label htmlFor={`player${index + 1}`}>{`Invocador ${index + 1}`}</label>
              <input
                type="text"
                id={`player${index + 1}`}
                className="form-control"
                value={playerNames[index]}
                onChange={(event) => handleNameChange(index, event)}
              />
            </div>
          ))}
          <button className="btn btn-primary button" onClick={handleDrawTeams}>Sortear Times</button>
        </div>
      )}

      {teams.length > 0 && (
        <div className="teams-results">
          <h4 style={{textAlign:'center'}}>Resultados do Sorteio:</h4>
          <div className="cards-container d-flex justify-content-center">
            {teams.map((team, index) => (
              <div key={index} className="team-card">
                <h5>{`Time ${index + 1}:`}</h5>
                <div className="players">
                  {team.map((player, i) => (
                    <div key={i} className="player-card">
                      {player}
                    </div>
                  ))}
                </div>
              </div>
            ))}
          </div>
        </div>
      )}
    </div>
  );
}
