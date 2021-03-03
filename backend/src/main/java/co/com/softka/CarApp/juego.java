package co.com.softka.CarApp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJuego")
    private  int idJuego;
    @Column(name = "juegoiniciado")
    private boolean juegoiniciado;

    public juego( boolean juegoiniciado) {
        this.juegoiniciado = juegoiniciado;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public boolean isJuegoiniciado() {
        return juegoiniciado;
    }

    public void setJuegoiniciado(boolean juegoiniciado) {
        this.juegoiniciado = juegoiniciado;
    }
}
