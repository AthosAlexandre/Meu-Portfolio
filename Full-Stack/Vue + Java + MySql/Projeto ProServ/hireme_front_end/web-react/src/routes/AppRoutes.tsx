import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from '../pages/Login/Login'
import Home from '../pages/Home'             // ajuste o import conforme seu arquivo
import Empregadas from '../pages/Empregadas' // ajuste o import conforme seu arquivo
import LayoutPadrao from '../components/layout' // seu layout com <Outlet />

export default function AppRoutes() {
  return (
    <BrowserRouter>
      <Routes>
        {/* Rota SEM layout */}
        <Route path="/login" element={<Login />} />

        {/* Rota PAI COM layout */}
        <Route path="/" element={<LayoutPadrao />}>
          {/* Rota “index” (ou seja, /) */}
          <Route index element={<Home />} />

          {/* Rota /empregadas */}
          <Route path="empregadas" element={<Empregadas />} />

          {/* Outras rotas que também usarão o LayoutPadrao */}
          {/* <Route path="exemplo" element={<Exemplo />} /> */}
        </Route>
      </Routes>
    </BrowserRouter>
  )
}
