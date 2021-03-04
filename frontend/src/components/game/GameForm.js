import React, {useState} from "react";

const GameForm = () => {
    const [numPlayers, setNumPlayers] =useState([]);
    const [longitud, setLongitud] =useState([]);
    console.log(numPlayers, longitud);
    return (
        <form className="containerFormGame">
            <h2 className="title">Crear Juego</h2>
            <div className="containerCreatePlayer">
                <input
                    type="number"
                    name="name"
                    required
                    placeholder="¿ Cuál es la cantidad de jugadores ?"
                    className="inputGame"
                    onChange={(event) => {
                        setNumPlayers({ numPlayers: event.target.value })
                    }} >
                </input>
                <input
                    type="number"
                    name="name"
                    required
                    placeholder="¿ Cuál es la longitud de la pista ?"
                    className="inputGame" 
                    onChange={(event) => {
                        setLongitud({ longitud: event.target.value })
                    }}>
                </input>
                <button type="submit" className="btn-link btnGame text-regular">Crear</button>
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
                <button type="submit" className="btn-link btnGame text-regular">Comenzar</button>
            </div>
        </form>
    );
}
export default GameForm;