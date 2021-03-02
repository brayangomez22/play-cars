import React from 'react';
import { Link } from 'react-router-dom';  

import Jc from '../img/jc.jpg';

const Game = () => {

    const toggleForm = () => {
        let containerGame = document.querySelector('.containerGame .container');
        containerGame.classList.toggle('active');
    }

    return (
        <div>
            <div className="headerGame">
                <Link to="/" className="btn-home">Home</Link> / Game
            </div>
            <section className="containerGame">
                <div className="container">
                    <div className="players createPlayer">
                        <div className="imgBx"><img src={Jc} alt=""></img></div>
                        <div className="formBx">
                            <form>
                                <h2>Crear un jugador</h2>
                                <input type="text" placeholder="Nombre del jugador"></input>
                                <input type="submit" value="Crear"></input>
                                <p className="watch">Quieres ver los jugadores ? <a href="#" onClick={toggleForm}>Ver Jugadores</a></p>
                            </form>
                        </div>
                    </div>
                    <div className="players playerList">
                        <div className="formBx">
                            <div>
                                <div className="box">
                                    <h3>Todos los jugadores</h3>
                                    <ul>
                                        <li><span>1</span>Brayan Gómez</li>
                                        <li><span>2</span>Daniela Grajales</li>
                                        <li><span>3</span>David Uribe</li>
                                        <li><span>4</span>Juan Pablo</li>
                                        <li><span>5</span>Jacobo Oquendo</li>
                                    </ul>
                                </div>
                                
                                <p className="watch">Quieres crear un nuevo jugador ? <a href="#" onClick={toggleForm}>Crear</a></p>
                            </div>
                        </div>
                        <div className="imgBx"><img src={Jc} alt=""></img></div>
                    </div>
                </div>
            </section>
        </div>
    );
}

export default Game;