import styled from 'styled-components';
import Introdução from './components/conteúdo/Introdução';

const Container = styled.div`
text-align: center;
display: flex;
flex-direction: column;
background-color: #eafed9;
`
const Header = styled.div`
display: flex;
align-items: center;
justify-content: center;
>img{
  width: 40px;  
}
`

function App() {
  return (
   <Container>
     <Header>
     <h1>BootCamp DIO</h1>
     <img src='https://cdn-icons-png.flaticon.com/512/1720/1720126.png' alt='Figura de um computador'/>
    </Header>
     <Introdução />
   </Container>
  );
}

export default App;
