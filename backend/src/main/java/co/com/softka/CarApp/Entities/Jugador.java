package co.com.softka.CarApp.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Table(name = "Jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador")
    private int idJugador;
    @NotNull
    @NotBlank(message = "Name can't be empty")
    @Size(min = 1, max = 100, message = "The list only can be 1 or 100 characters")
    @Pattern(regexp = "[a-zA-Z0-9@\\s]+", message = "The list only can contain letters and numbers")
    @Column(name = "name", length = 100)
    private String nombreJugador;
    @Column(name = "vecesWinner")
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
        this.vecesWinner+=1;
    }

}
