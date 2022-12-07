package dwit.sabetech.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "webcam")
public class Webcam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String dualCamera;
    private String arrayDigital;

    public Webcam() {
    }

    public Webcam(Long id,
                  String brand,
                  String dualCamera,
                  String arrayDigital) {
        this.id = id;
        this.brand = brand;
        this.dualCamera = dualCamera;
        this.arrayDigital = arrayDigital;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDualCamera() {
        return dualCamera;
    }

    public void setDualCamera(String dualCamera) {
        this.dualCamera = dualCamera;
    }

    public String getArrayDigital() {
        return arrayDigital;
    }

    public void setArrayDigital(String arrayDigital) {
        this.arrayDigital = arrayDigital;
    }

    @Override
    public String toString() {
        return "Webcam{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", dualCamera='" + dualCamera + '\'' +
                ", arrayDigital='" + arrayDigital + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Webcam webcam = (Webcam) o;

        return Objects.equals(id, webcam.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

