import React from 'react';
import { Link } from "react-router-dom";

const BodyHome = () => {
    window.addEventListener('scroll', () => {
        const header = document.getElementById('containerHeader');
        header.style.opacity = '1' - window.pageYOffset / 550;
    });
    return (
        <main id="main">
            <section className="container">
                <h2 className="subtitle-h2">Descripción</h2>
                <p><span className="letter-capital">El</span> juego se compone de un número de jugadores
                que se proponen competir en una pista de carreras. A cada jugador se le asigna un ávatar de
                conductor con su respectivo auto, permitiendole entrar en esta intensa carrera que viene incluída
                en los MiniJuegos de SofkaU.</p>
                <br/>
                <br/>
                <br/>
                <br/>
                <br/>
                <Link to="/history" className="letter-capital linkHome"><span>Historial</span></Link>
            </section>
        </main>
    );
}

export default BodyHome;