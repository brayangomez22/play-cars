import React from 'react'; 
import car from '../img/car.svg';

const HeaderHome = () => {

    return (
        <header className="containerHeader" id="containerHeader">
            <div className="textHeader">
                <p className="icon">
                    <img src={car} className="icon" alt="car"></img>
                </p>
                <h1 className="title">
                    Carreras con SofkaU<br></br>¡Entra Ya!<br></br>
                    <span className="title-orange-neon text-regular">Si ganas, te llevas una hamburguesa</span>
                </h1>
                <p className="description">
                    Tenemos nuevos puestos para ti<br></br>
                    Aprovecha esta oportunidad tan grande. <br></br>
                    No olvides que todo lo que te propongas lo puedes lograr.
                </p>
                <a href="#main" className="btn-link text-regular">Más información</a>
                <a href="/game" className="btn-link text-regular">Comenzar</a>
            </div>
	    </header>
    );
}

export default HeaderHome;