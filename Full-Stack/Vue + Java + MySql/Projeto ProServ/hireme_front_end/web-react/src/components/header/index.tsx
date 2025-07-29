import { Flex } from 'antd';
import proservLogo from '../../assets/img/proserv-com-fundo.webp';
import './header.css'
export default function Header() {
  return (
    <>
      <Flex justify="space-around" align="center" className='header'>
        <img className='imagem-logo' src={proservLogo} alt="Logo" />
        <h3>ProServ</h3>
      </Flex>
    </>
  );
}
