package co.com.softka.CarApp.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Table(name = "Conductor")
public class Conductor extends Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConductor")
    private String idConductor;

    @Column(name = "idCarro")
    private int idCarro;

    public Conductor(String nombreJugador, int idCarro) {
        super(nombreJugador);

        this.idCarro = idCarro;
    }

    public Conductor() {
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
