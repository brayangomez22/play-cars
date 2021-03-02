package co.com.softka.CarApp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pista {
    private int idPista;
    private String Name;
    private int numeroCarriles;
    private double kilometros;
    private Object[] resultado;
    private ArrayList<Carril> carriles;


    public Pista(String name, int numeroCarriles, double kilometros, ArrayList<Carril> carriles) {
        Name = name;
        this.numeroCarriles = numeroCarriles;
        this.kilometros = kilometros;
        this.carriles = carriles;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumeroCarriles() {
        return numeroCarriles;
    }

    public void setNumeroCarriles(int numeroCarriles) {
        this.numeroCarriles = numeroCarriles;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public Object[] getResultado() {
        return resultado;
    }

    public void setResultado(Object[] resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Carril> getCarriles() {
        return carriles;
    }

    public void setCarriles(ArrayList<Carril> carriles) {
        this.carriles = carriles;
    }

    private double Jugar(){
        boolean finJuego = false;
        do{
            for (int i = 0; i<this.carriles.toArray().length;i++ ) {


                
            }
            
            
        }while (finJuego);
        
        
        return 1;
    }


    private void asignarGanador(String documento) {
        Conductor conductorGanador = new Conductor();
        conductorGanador.getDocumentoConductor().equals(documento);
        conductorGanador.ganador();
    }

}

