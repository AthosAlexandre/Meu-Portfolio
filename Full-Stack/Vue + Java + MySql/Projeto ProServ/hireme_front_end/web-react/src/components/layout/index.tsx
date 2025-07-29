import React, { useState } from 'react';
import {
  DesktopOutlined,
  FileOutlined,
  PieChartOutlined,
  TeamOutlined,
  UserOutlined,
} from '@ant-design/icons';
import type { MenuProps } from 'antd';
import { Breadcrumb, Layout, Menu, theme } from 'antd';
import { Outlet, useNavigate } from 'react-router-dom'; // IMPORTANTE
import HeaderPadrao from './../../components/header/index';

const { Header, Content, Footer, Sider } = Layout;

type MenuItem = Required<MenuProps>['items'][number];

function getItem(
  label: React.ReactNode,
  key: React.Key,
  icon?: React.ReactNode,
  children?: MenuItem[],
): MenuItem {
  return {
    key,
    icon,
    children,
    label,
  } as MenuItem;
}

// Você pode usar 'key' para identificar a rota
// Por exemplo, 'empregadas' -> rota /empregadas
const items: MenuItem[] = [
  getItem('Empregadas', 'empregadas', <PieChartOutlined />),
  getItem('Option 2', '2', <DesktopOutlined />),
  getItem('User', 'sub1', <UserOutlined />, [
    getItem('Tom', '3'),
    getItem('Bill', '4'),
    getItem('Alex', '5'),
  ]),
  getItem('Team', 'sub2', <TeamOutlined />, [
    getItem('Team 1', '6'),
    getItem('Team 2', '8'),
  ]),
  getItem('File', 'file', <FileOutlined />), // <-- Aqui o item que vai navegar
];

export default function LayoutPadrao() {
  const [collapsed, setCollapsed] = useState(false);
  const {
    token: { colorBgContainer, borderRadiusLG },
  } = theme.useToken();

  // Hook do react-router-dom para navegar programaticamente
  const navigate = useNavigate();

  // Função que lida com o clique no Menu
  const onMenuClick: MenuProps['onClick'] = (info) => {
    // 'info.key' é o valor que definimos como 'key' em cada item
    if (info.key === 'empregadas') {
      navigate('/empregadas'); // Redireciona para /empregadas
    } else {
      // Você pode fazer outros casos ou navegações aqui
      // Ex: navigate('/user') se info.key === 'sub1'
    }
  };

  return (
    <Layout style={{ minHeight: '100vh' }}>
      <Sider collapsible collapsed={collapsed} onCollapse={(value) => setCollapsed(value)}>
        <div className="demo-logo-vertical" />
        <Menu
          theme="dark"
          defaultSelectedKeys={['1']}
          mode="inline"
          items={items}
          onClick={onMenuClick} // Aqui chamamos a função
        />
      </Sider>
      <Layout>
        <HeaderPadrao />
        <Content style={{ margin: '0 16px' }}>
          <Breadcrumb style={{ margin: '16px 0' }}>
            <Breadcrumb.Item>User</Breadcrumb.Item>
            <Breadcrumb.Item>Bill</Breadcrumb.Item>
          </Breadcrumb>
          <div
            style={{
              padding: 24,
              minHeight: 360,
              background: colorBgContainer,
              borderRadius: borderRadiusLG,
            }}
          >
            <Outlet />
          </div>
        </Content>
        <Footer style={{ textAlign: 'center' }}>
          ProServ ©{new Date().getFullYear()} MauThos
        </Footer>
      </Layout>
    </Layout>
  );
}
