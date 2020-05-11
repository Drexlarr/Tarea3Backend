package pe.upc.relaciones.entidades;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_MOTOR")
public class Motor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMotor;
    private String modelo;
    private String marca;
    private double precio;

    public Motor() {
        super();
    }

    public Motor(Long idMotor, String modelo, String marca, double precio) {
        super();
        this.idMotor = idMotor;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public Long getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(Long idMotor) {
        this.idMotor = idMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motor)) return false;
        Motor motor = (Motor) o;
        return idMotor.equals(motor.idMotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMotor);
    }
}
