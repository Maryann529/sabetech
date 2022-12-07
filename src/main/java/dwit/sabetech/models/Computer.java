package dwit.sabetech.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "computer")
public class Computer extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String processor_speed;
    private Integer number_of_cores;
    private Integer number_of_usb;
    private Integer number_of_hdmi_ports;
    private Integer storage;

    public Computer() {
    }

    public Computer(Long id,
                    String brand,
                    String processor_speed,
                    Integer number_of_cores,
                    Integer number_of_usb,
                    Integer number_of_hdmi_ports,
                    Integer storage) {
        this.id=id;
        super.setBrand(brand);
        this.processor_speed = processor_speed;
        this.number_of_cores = number_of_cores;
        this.number_of_usb = number_of_usb;
        this.number_of_hdmi_ports = number_of_hdmi_ports;
        this.storage = storage;
    }


    public String getProcessor_speed() {
        return processor_speed;
    }

    public void setProcessor_speed(String processor_speed) {
        this.processor_speed = processor_speed;
    }

    public Integer getNumber_of_cores() {
        return number_of_cores;
    }

    public void setNumber_of_cores(Integer number_of_cores) {
        this.number_of_cores = number_of_cores;
    }

    public Integer getNumber_of_usb() {
        return number_of_usb;
    }

    public void setNumber_of_usb(Integer number_of_usb) {
        this.number_of_usb = number_of_usb;
    }

    public Integer getNumber_of_hdmi_ports() {
        return number_of_hdmi_ports;
    }

    public void setNumber_of_hdmi_ports(Integer number_of_hdmi_ports) {
        this.number_of_hdmi_ports = number_of_hdmi_ports;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

