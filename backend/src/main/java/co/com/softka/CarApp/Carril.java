package co.com.softka.CarApp;

public class Carril{
    private int idCarril;
    private int numeroCarril;
    private double porcentajeTotal;
    private double distancia;


    public Carril( String apodo, String documento, String nombre, int numeroCarril, double distancia) {
        this.numeroCarril = numeroCarril;
        this.distancia = distancia;
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
        if (porcentajeTotal ==0){
            return this.porcentajeTotal = calcularPorcentaje(distanciaEnMetros);
        } return this.porcentajeTotal+= calcularPorcentaje(distanciaEnMetros);
    }

    private double calcularPorcentaje( double distancia){

        Carro carro = new Carro();
        return (carro.Avanzar()*100)/distancia ;
    }


}
