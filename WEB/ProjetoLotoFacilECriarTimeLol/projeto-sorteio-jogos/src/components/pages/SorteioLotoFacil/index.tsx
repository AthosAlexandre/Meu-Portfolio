import React, { useState } from 'react';
import './SorteioLotoFacil.css'; // Certifique-se de criar este arquivo CSS

export default function SorteioLotoFacil() {
  const [numbers, setNumbers] = useState([]);

  const sortearNumeros = () => {
    const generatedNumbers = new Set();
    
    while (generatedNumbers.size < 15) {
      const number = Math.floor(Math.random() * 25) + 1;
      generatedNumbers.add(number);
    }

    setNumbers(Array.from(generatedNumbers).sort((a, b) => a - b));
  };

  return (
    <div className='container'>
      <h1 className='display-5 title-page'>Sorteio Loto Facil</h1>
      <button className='btn btn-primary' onClick={sortearNumeros}>
        Sortear Números
      </button>

      <div className='numbers-results'>
        {numbers.map((number, index) => (
          <div key={index} className='number-card'>
            {number}
          </div>
        ))}
      </div>
    </div>
  );
}
