package co.com.softka.CarApp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
@Table(name = "Pista")
public class Pista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPista")
    private int idPista;
    @Column(name = "idJuego")
    private int idJuego;
    @Column(name = "numeroCarriles")
    private int numeroCarriles;
    @NotNull
    @NotBlank(message = "longitudKilometros can't be empty")
    @Pattern(regexp = "[0-9]+", message = "The list only can contain numbers")
    @Column(name = "longitudKilometros")
    private double longitudKilometros;
    @Column(name = "podio")
    private Array[] podio;

    public Pista(int idJuego, int numeroCarriles, double longitudKilometros) {
        this.idJuego = idJuego;
        this.numeroCarriles = numeroCarriles;
        this.longitudKilometros = longitudKilometros;
    }


    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public double getLongitudKilometros() {
        return longitudKilometros;
    }

    public void setLongitudKilometros(double longitudKilometros) {
        this.longitudKilometros = longitudKilometros;
    }

    public Array[] getPodio() {
        return podio;
    }

    public void setPodio(Array[] podio) {
        this.podio = podio;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }



    public int getNumeroCarriles() {
        return numeroCarriles;
    }

    public void setNumeroCarriles(int numeroCarriles) {
        this.numeroCarriles = numeroCarriles;
    }


/*
    private double Jugar(){
        boolean finJuego = false;
        do{
            for (int i = 0; i<this.carriles.toArray().length;i++ ) {


                
            }
            
            
        }while (finJuego);
        
        
        return 1;
    }
*/



}

