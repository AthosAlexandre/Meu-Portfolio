import './Navegacao.css';
import React, { useState } from 'react';
import { Link, useLocation } from 'react-router-dom';
import * as FaIcons from "react-icons/fa";
import * as AiIcons from "react-icons/io5";
import { IconContext } from 'react-icons';
import { SidebarData } from './SidebarData';

export default function Navegacao() {
  const [sidebar, setSidebar] = useState(false);
  const showSidebar = () => setSidebar(!sidebar);
  
  const location = useLocation(); // Obtenha a localização atual

  return (
    <>
      <IconContext.Provider value={{ color: '#fff' }}>
        <div className="navbar">
          <Link to='#' className='menu-bars'>
            <FaIcons.FaBars onClick={showSidebar} />
          </Link>
        </div>

        <nav className={sidebar ? 'nav-menu active' : 'nav-menu'}>
          <ul className='nav-menu-items'>
            <li className='navbar-toggle'>
              <Link to='#' className='menu-bars'>
                <AiIcons.IoClose onClick={showSidebar} />
              </Link>
            </li>
            {SidebarData.map((item, index) => {
              return (
                <li key={index} className={item.cName}>
                  <Link 
                    to={item.path} 
                    onClick={showSidebar} 
                    className={location.pathname === item.path ? 'active' : ''} // Adiciona a classe 'active'
                  >
                    {item.icon}
                    <span>{item.title}</span>
                  </Link>
                </li>
              );
            })}
          </ul>
        </nav>
      </IconContext.Provider>
    </>
  );
};
