package co.com.softka.CarApp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCar")
    private int idCar;
    @NotNull
    @NotBlank(message = "Name can't be empty")
    @Size(min = 1, max = 100, message = "The list only can be 1 or 100 characters")
    @Pattern(regexp = "[a-zA-Z0-9@\\s]+", message = "The list only can contain letters and numbers")
    @Column(name = "Apodo", length = 50)
    private String Apodo;
    @Column(name = "complete")
    @Pattern(regexp = "[0-9]+", message = "The list only can contain numbers")
    private int idCarril;

    public Carro(String apodo) {
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

    public int getIdCarril() {
        return idCarril;
    }

    public void setIdCarril(int idCarril) { this.idCarril = idCarril; }

    public double Avanzar(){
        return Math.ceil(Math.random()*6)*100;
    }

}
