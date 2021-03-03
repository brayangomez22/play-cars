package co.com.softka.CarApp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pista {
    private int idPista;
    private int idJuego;
    private int numeroCarriles;
    private double longitudKilometros;
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

