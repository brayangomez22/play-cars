package co.com.softka.CarApp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Conductor")
public class Conductor extends Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConductor")
    private String idConductor;
    @NotNull
    @NotBlank(message = "Name can't be empty")
    @Size(min = 1, max = 100, message = "The list only can be 1 or 100 characters")
    @Pattern(regexp = "[a-zA-Z\\s]+", message = "The list only can contain letters and numbers")
    @Column(name = "nombreConductor", length = 100)
    private String nombreConductor;
    @Column(name = "idCarro")
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
