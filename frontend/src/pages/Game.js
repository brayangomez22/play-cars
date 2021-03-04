import React from 'react';
import { Link } from 'react-router-dom';  

const Game = () => {

    return (
        <div className="containerGame">
           <h3 className="tileGame"><Link to="/" className="linkHome">Home</Link>  / Game</h3>

            <div className="containerGameCar">
                <form className="containerFormGame">
                    <h2 className="title">Crear Juego</h2>
                    <div className="containerCreatePlayer">
                        <input
                            type="number"
                            name="name"
                            placeholder="¿ Cuál es la cantidad de jugadores ?"
                            className="inputGame" >    
                        </input>
                        <input
                            type="number"
                            name="name"
                            placeholder="¿ Cuál es la longitud de la pista ?"
                            className="inputGame" >    
                        </input>

                        <div className="containerNamePlayers">
                            <h2 className="title tileNames">Digite los nombres de los jugadores</h2>

                            <input
                                type="text"
                                name="name"
                                placeholder="¿ Nombre del #1 jugador ?"
                                className="inputGame" >    
                            </input>
                            <input
                                type="text"
                                name="name"
                                placeholder="¿ Nombre del #2 jugador ?"
                                className="inputGame" >    
                            </input>
                        </div>

                        <a href="#" class="btn-link btnGame text-regular">Comenzar</a>
                    </div>
                </form>

                <table>
                    <thead>
                        <tr>
                            <td className="gomez">ID</td>
                            <td className="gomez">Nombre</td>
                            <td className="gomez">Acciones</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>#1</td>
                            <td>Brayan</td>
                            <td><button className="button edit">Eliminar</button></td>
                        </tr>

                        <tr>
                            <td>#2</td>
                            <td>David</td>
                            <td><button className="button edit">Eliminar</button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default Game;