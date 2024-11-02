import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import SorteioCompanheirosLol from '../pages/SorteioCompanheirosLol';
import SorteioLotoFacil from '../pages/SorteioLotoFacil';
import Navegacao from '../Navegacao';

function AppRoutes() {
  return (
    <Router>
      <Navegacao />
      <Routes>
        <Route path="/" element={<SorteioCompanheirosLol />} />
        <Route path="/sorteio-loto-facil" element={<SorteioLotoFacil />} />
      </Routes>
    </Router>
  );
}

export default AppRoutes;
