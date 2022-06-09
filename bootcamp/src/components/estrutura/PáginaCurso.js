import React from 'react';
import styled from 'styled-components';

const PaginaContainer = styled.div`
display: flex;
flex-direction: column;
align-items: center;
justify-content = center;
`
const Title = styled.h2`
background-color: red;
`
const Description = styled.p`
`

function PaginaCurso(props) {
    return (
        <PaginaContainer>

            <Title>{props.title}</Title>
            <Description>{props.description}</Description>

       </PaginaContainer>

    )
}

export default PaginaCurso