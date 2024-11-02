import React from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import AppRoutes from './components/AppRoutes/index.tsx'
import 'bootstrap/dist/css/bootstrap.min.css';

createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <AppRoutes />
  </React.StrictMode>
)