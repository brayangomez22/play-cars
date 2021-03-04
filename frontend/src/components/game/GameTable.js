import React from "react";

const GameTable = () => {
    return (
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
    );
}
export default GameTable;