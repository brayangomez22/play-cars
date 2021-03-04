import React from 'react'; 
import car from '../img/car.svg';

const HeaderHome = () => {

    return (
        <header class="containerHeader" id="containerHeader">
            <div class="textHeader">
                <p class="icon">
                    <img src={car} className="icon" alt="car"></img>
                </p>
                <h1 class="title">
                    Carreras con SofkaU<br></br>¡Entra Ya!<br></br>
                    <span class="title-orange-neon text-regular">Si ganas, te llevas una hamburguesa</span>
                </h1>
                <p class="description">
                    Tenemos nuevos puestos para ti<br></br>
                    Aprovecha esta oportunidad tan grande. <br></br>
                    No olvides que todo lo que te propongas lo puedes lograr.
                </p>
                <a href="#main" class="btn-link text-regular">Más información</a>
                <a href="/game" className="btn-link text-regular">Comenzar</a>
            </div>
	    </header>
    );
}

export default HeaderHome;