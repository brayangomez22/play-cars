package co.com.softka.CarApp;

public class Conductor extends Jugador {
    private String idConductor;
    private String nombreConductor;
    private int idCarro;

    public Conductor(String nombreJugador, String nombreConductor, int idCarro) {
        super(nombreJugador);
        this.nombreConductor = nombreConductor;
        this.idCarro = idCarro;
    }

    public Conductor() {
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
}
