import React from 'react';
import { Link } from 'react-router-dom';  
import car from '../img/car.svg'

const HeaderHome = () => {
    return (
        <header class="containerHeader" id="containerHeader">
            <div class="textHeader">
                <p class="icon">
                    <img src={car} className="icon" alt="car"></img>
                </p>
                <h1 class="title">
                    Carreras con Brayan<br></br>¡Entra Ya!<br></br>
                    <span class="title-orange-neon text-regular">Si ganas, me ganas a mí</span>
                </h1>
                <p class="description">
                    Tenemos nuevos puestos para ti<br></br>
                    Aprovecha esta oportunidad tan grande. <br></br>
                    No olvides que todo lo que te propongas lo puedes lograr.
                </p>
                <a href="#main" class="btn-link text-regular">Más información</a>
                <Link to="/game" className="btn-link text-regular">Comenzar</Link>
            </div>
	    </header>
    );
}

export default HeaderHome;