package co.com.softka.CarApp.Entities;

import javax.persistence.*;
import javax.validation.constraints.Pattern;



@Table(name = "Carril")
public class Carril extends Pista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarril")
    private int idCarril;
    @Pattern(regexp = "[0-9]+", message = "The numeroCarril only can contain numbers")
    @Column(name = "numeroCarril")
    private int numeroCarril;
    @Column(name = "porcentajeTotal")
    private double porcentajeTotal;
    @Column(name = "distancia")
    private double distancia = super.getLongitudKilometros()*1000;



    public Carril(int idJuego, int numeroCarriles, double longitudKilometros, int numeroCarril, double distancia) {
        super(idJuego, numeroCarriles, longitudKilometros);
        this.numeroCarril = numeroCarril;
        this.distancia = distancia;
    }

    public Carril(int idJuego, int numeroCarriles, double longitudKilometros) {
        super(idJuego, numeroCarriles, longitudKilometros);
    }

    public int getIdCarril() {
        return idCarril;
    }

    public void setIdCarril(int idCarril) {
        this.idCarril = idCarril;
    }

    public int getNumeroCarril() {
        return numeroCarril;
    }

    public void setNumeroCarril(int numeroCarril) {
        this.numeroCarril = numeroCarril;
    }

    public double getPorcentajeTotal() {
        return porcentajeTotal;
    }

    public void setPorcentajeTotal(double porcentajeTotal) {
        this.porcentajeTotal = porcentajeTotal;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double porcentaje(double distanciaKilometros){
        double distanciaEnMetros = distanciaKilometros*1000;
         return this.porcentajeTotal+= calcularPorcentaje(distanciaEnMetros);
    }

    private double calcularPorcentaje( double distancia){

        Carro carro = new Carro();
        return (carro.Avanzar()*100)/distancia ;
    }


/*
    private void asignarGanador(int idjugador) {
        Jugador jugadorGanador = new Conductor();
        jugadorGanador.getIdJugador();
        jugadorGanador.ganador();
    }
*/

}
