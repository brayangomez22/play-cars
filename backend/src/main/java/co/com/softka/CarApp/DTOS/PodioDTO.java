package co.com.softka.CarApp.DTOS;


public class PodioDTO {

    private Long idPodio;
    private int idJuego;
    private int primerPuesto;
    private int segundoPuesto;
    private int tercerPuesto;

    public Long getIdPodio() {
        return idPodio;
    }

    public void setIdPodio(Long idPodio) {
        this.idPodio = idPodio;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getPrimerPuesto() {
        return primerPuesto;
    }

    public void setPrimerPuesto(int primerPuesto) {
        this.primerPuesto = primerPuesto;
    }

    public int getSegundoPuesto() {
        return segundoPuesto;
    }

    public void setSegundoPuesto(int segundoPuesto) {
        this.segundoPuesto = segundoPuesto;
    }

    public int getTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(int tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }
}
