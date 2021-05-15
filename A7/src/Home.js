import React from 'react';
import ReactDOM from 'react-dom';
import conf from './Images/conf.jpg';


export default function Home(){
    return (
    <div>
        <p>
        <img id="photo" src={conf} width="900" height="500"></img>
        </p>
     <p id="content">ICSDII 2021: International Conference on Sports Sciences and Human Movement aims to bring together 
       leading academic scientists, researchers and research scholars to exchange and share their
        experiences and research results on all aspects of Sports Sciences and Human Movement. 
        It also provides a premier interdisciplinary platform for researchers, practitioners and 
        educators to present and discuss the most recent innovations, trends, and concerns as well as 
        practical challenges encountered and solutions adopted in the fields of Sports Sciences and Human Movement
    </p>
    </div>
   
    );
}