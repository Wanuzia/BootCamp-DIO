import React from 'react';
import styled from 'styled-components';

const CardContainer = styled.div`
width: 700px;
border: 2px solid #6daed3;
height: 300px;
text-align: center;
padding: 10px;
margin-top: 10px;
margin-bottom: 20px;
background-color: orange;
`

function CardResumo(props) {
    return (
        <CardContainer>
        <h3>{props.tema}</h3>
        <p>{props.tópico1}</p>
        <p>{props.tópico2}</p>
        <p>{props.tópico3}</p>
        <p>{props.tópico4}</p>
        <p>{props.tópico5}</p>
        </CardContainer>

    )
}

export default CardResumo