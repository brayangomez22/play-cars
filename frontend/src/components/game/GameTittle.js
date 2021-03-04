import React from 'react';
import { Link } from 'react-router-dom';

const GameTittle = () => {
    return (<h3 className="tileGame"><Link to="/" className="linkHome">Home</Link>  / Game</h3>);
}
export default GameTittle;