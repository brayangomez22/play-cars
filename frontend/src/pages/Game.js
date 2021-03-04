import React from 'react';
import GameTittle from '../components/game/GameTittle';
import GameForm from '../components/game/GameForm';
import GameTable from '../components/game/GameTable';


const Game = () => {

    return (
        <div className="containerGame">
            <GameTittle />
            <div className="containerGameCar">
                <GameForm />
                <GameTable/>
            </div>
        </div>
    );
}

export default Game;