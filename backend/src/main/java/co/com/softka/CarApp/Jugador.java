package co.com.softka.CarApp;

public class Jugador {

    private int idJugador;
    private String nombreJugador;
    private int vecesWinner;

    public Jugador(String nombreJugador, int vecesWinner) {
        this.nombreJugador = nombreJugador;
        this.vecesWinner = vecesWinner;
    }

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Jugador() {
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getVecesWinner() {
        return vecesWinner;
    }

    public void setVecesWinner(int vecesWinner) {
        this.vecesWinner = vecesWinner;
    }

    public void ganador(){
        if (this.vecesWinner == 0 ){
            this.vecesWinner = 1;
        }
        else
            this.vecesWinner+=1;
    }

}
