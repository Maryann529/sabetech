package dwit.sabetech.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mouse")
public class Mouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String typeWireless;
    private String color;

    public Mouse() {
    }

    public Mouse(Long id,
                 String brand,
                 String model,
                 String typeWireless,
                 String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.typeWireless = typeWireless;
        this.color = color;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeWireless() {
        return typeWireless;
    }

    public void setTypeWireless(String typeWireless) {
        this.typeWireless = typeWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeWireless='" + typeWireless + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mouse mouse = (Mouse) o;

        return Objects.equals(id, mouse.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
