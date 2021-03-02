package co.com.softka.CarApp;

public class Jugador {

    private int idJugador;
    private String nombre;
    private int vecesWinner;

    public Jugador(String nombre, int vecesWinner) {
        this.nombre = nombre;
        this.vecesWinner = vecesWinner;
    }

    public Jugador() {
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
