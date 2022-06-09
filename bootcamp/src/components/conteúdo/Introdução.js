import React from "react";
import styled from 'styled-components';
import CardPequeno from "../estrutura/CardPequeno";
import CardResumo from "../estrutura/CardResumo";
import PaginaCurso from "../estrutura/PáginaCurso";

const ContainerCurso = styled.div`
display: flex;
flex-direction: column;
align-items: center;
justify-content = center;
`

function Introdução() {
    return (
        <ContainerCurso>
            <PaginaCurso
                title='Introdução'
                description='Curso ministrado pela especialista em  Tech Juliana Mascarenhas'
            />
            <CardResumo tema='PENSAMENTO COMPUTACIONAL'
                tópico1='1. O pensamento computacional é aplicado a qualquer área do conhecimento.'
                tópico2='2. Pensar computacionalmente é uma maneira de resolver qualquer problema de forma mais objetiva e eficiente.'
                tópico3='3. Dentre as habilidades que desenvolvemos estão o raciocínio lógico (indução, dedução e abdução) e o aperfeiçoamento, que inclui a simplificação de linhas de código e funções bem definidas.'
                tópico4='4. Os pilares do pensamento computacional são: decomposição(quebrar o problema em partes menores), padrões(encontrar similaridades e diferenças), abstração(generalizar) e algoritmos(instruções passo a passo para resolução do problema).'
            />
            <CardResumo
                tema='LÓGICA DE PROGRAMAÇÃO'
                tópico1='1. A Lógica é uma parte da filosofia que busca determinar o que é verdadeiro ou falso.'
                tópico2='2. A Lógica em programação é o ordenamento e preparação das instruções para a implantação de um programa.'
                tópico3='3. A lógica vai determinar a sequência das instruções detalhadas.'
                tópico4='4. Dentre as técnicas de lógica, existem a Técnica Linear(ordenação sequenciada em uma única dimensão), Técnica Estruturada (a ordenação dos elementos essenciais), Técnica Modular(entende o problema como partes independentes, controladas por regras).'
            /> 
            <CardResumo
                tema='ALGUNS FUNDAMENTOS E PARADIGMAS'
                tópico1='1.	As variáveis são como caixinhas que armazenam determinado valor a elas atribuído.'
                tópico2='2. Tipos de variáveis: tipo numérico, tipo caractere, em muitas linguagens chamadas de string(texto) e tipo lógico ou booleano(verdadeiro ou falso).'
                tópico3='3. Dentre os Paradigmas de programação, temos os classificados como Orientção à Objetos, Procedural, Funcional, Estruturado, Computação distribuída e Lógico.'
                tópico4='4. Enquanto o Paradigma da Orientação a objetos possibilita o reuso de código, o Paradigma Estruturado, por sua vez,  é voltado para problemas específicos e diretos.'
            />
            <CardPequeno 
                dica= 'Dica' imagem='https://cdn-icons-png.flaticon.com/512/13/13467.png' alt='Ícone de uma folha referente à uma lista e uma caneta, em preto e branco'
                texto='Um site bom para se praticar algoritmos sem a utilização de uma linguagem de programação específica é o '
                link="https://portugol-webstudio.cubos.io/"
                site='Portugol WebStudio.'
            />
        </ContainerCurso>
    )
}

export default Introdução