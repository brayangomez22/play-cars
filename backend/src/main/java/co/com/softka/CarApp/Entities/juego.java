package co.com.softka.CarApp.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJuego")
    private  int idJuego;
    @Column(name = "juegoIniciado")
    private boolean juegoIniciado;

    public juego( boolean juegoIniciado) {
        this.juegoIniciado = juegoIniciado;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public boolean isJuegoIniciado() {
        return juegoIniciado;
    }

    public void setJuegoIniciado(boolean juegoIniciado) {
        this.juegoIniciado = juegoIniciado;
    }

    public void iniciarJuego(boolean juegoIniciado){
        if (!juegoIniciado){
            this.juegoIniciado=true;
        }else{
            System.out.println("El juego ya esta iniciado");
        }

    }
}
