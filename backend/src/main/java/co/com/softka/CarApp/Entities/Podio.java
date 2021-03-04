package co.com.softka.CarApp.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Podio")
public class Podio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPodio")
    private Long idPodio;
    @Column(name = "idJuego")
    private int idJuego;
    @Column(name = "primerPuesto")
    private int primerPuesto;
    @Column(name = "segundoPuesto")
    private int segundoPuesto;
    @Column(name = "tercerPuesto")
    private int tercerPuesto;

    public Podio(int idJuego, int primerPuesto, int segundoPuesto, int tercerPuesto) {
        this.idJuego = idJuego;
        this.primerPuesto = primerPuesto;
        this.segundoPuesto = segundoPuesto;
        this.tercerPuesto = tercerPuesto;
    }

    public Podio() {
    }

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
