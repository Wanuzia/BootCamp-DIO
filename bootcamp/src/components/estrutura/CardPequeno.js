import React from "react";
import styled from 'styled-components';

const CardPequenoContainer = styled.div`
width: 700px;
border: 2px solid #6daed3;
height: 150px;
text-align: center;
padding: 10px;
margin-top: 10px;
margin-bottom: 20px;
background-color: #6ddad3;
font-weight: bold;
`
const DicaHeader = styled.div`
display: flex;
align-items: center;
justify-content: center;
>h3 {
    font-weight: bold;
   }
>img{
    width: 30px; 
}
`

function CardPequeno(props) {
    return (
        <CardPequenoContainer>
            <DicaHeader>
                <h3>{props.dica}</h3><img src={props.imagem} alt={props.alt} />
            </DicaHeader>
            <p>{props.texto}</p>
            <a href={props.link} rel="noreferrer" target='_blank'><p>{props.site}</p></a>

        </CardPequenoContainer>

    )
}

export default CardPequeno