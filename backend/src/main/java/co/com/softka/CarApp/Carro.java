package co.com.softka.CarApp;

public class Carro {

    private int idCar;
    private String Apodo;

    public Carro( String apodo) {
        Apodo = apodo;
    }

    public Carro() {
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String apodo) {
        Apodo = apodo;
    }

    public double Avanzar(){
        return Math.ceil(Math.random()*6)*100;
    }
}
