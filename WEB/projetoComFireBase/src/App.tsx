import React, { useEffect, useState } from 'react';
import { BrowserRouter, Route, Routes, Navigate } from 'react-router-dom';
import auth from './plugins/firebase-auth';
import HomeLogada from './views/homeLoagada';
import Autenticacao from './views/autenticacao';
import Cadastro from './views/cadastro';
import CadastroTarefa from './views/cadastroTarefa';


function App() {
  const [userAuthenticated, setUserAuthenticated] = useState(
    localStorage.getItem('userAuthenticated') === 'true'
  );

  useEffect(() => {
    const unsubscribe = auth.onAuthStateChanged((user) => {
      const userIsAuthenticated = !!user;
      setUserAuthenticated(userIsAuthenticated);
      localStorage.setItem('userAuthenticated', userIsAuthenticated.toString());
    });

    return () => unsubscribe();
  }, []);

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Autenticacao />} />
        <Route
          path="/homeLogada"
          element={
            userAuthenticated ? <HomeLogada /> : <Navigate to="/" />
          }
        />
        <Route path="/cadastrar" element={<Cadastro />} />
        <Route
          path="/cadastroTarefa"
          element={
            userAuthenticated ? <CadastroTarefa /> : <Navigate to="/" />
          }
        />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
