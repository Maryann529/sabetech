package dwit.sabetech.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Keyboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String type_wireless;
    private String color;
    private String numeric_keypad;
    private String backlight;

    public Keyboard() {
    }

    public Keyboard(Long id,
                    String brand,
                    String model,
                    String typeWireless,
                    String color,
                    String numeric_keypad,
                    String backlight) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type_wireless = type_wireless;
        this.color = color;
        this.numeric_keypad = numeric_keypad;
        this.backlight = backlight;
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
        return type_wireless;
    }

    public void setTypeWireless(String typeWireless) {
        this.type_wireless = typeWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeric_keypad() {
        return numeric_keypad;
    }

    public void setNumeric_keypad(String numeric_keypad) {
        this.numeric_keypad = numeric_keypad;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeWireless='" + type_wireless + '\'' +
                ", color='" + color + '\'' +
                ", numeric_keypad='" + numeric_keypad + '\'' +
                ", backlight='" + backlight + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Keyboard keyboard = (Keyboard) o;

        return Objects.equals(id, keyboard.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}