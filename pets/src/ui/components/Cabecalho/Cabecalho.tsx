import {
    CabecalhoContainer,
    Logo
} from './Cabecalho.style';

export default function Cabecalho(){
     return(
         <CabecalhoContainer>
             <Logo src = "/imagem/logo.svg" alt="Adote um Pet"/>
         </CabecalhoContainer>
     )
 }