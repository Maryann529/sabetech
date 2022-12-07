package dwit.sabetech.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "monitor")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String screenResolution;
    private Integer list_of_ports;
    private String typeHdmiPort;

    public Monitor() {
    }

    public Monitor(Long id,
                   String brand,
                   String model,
                   String screenResolution,
                   Integer list_of_ports,
                   String typeHdmiPort) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.screenResolution = screenResolution;
        this.list_of_ports = list_of_ports;
        this.typeHdmiPort = typeHdmiPort;
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

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Integer getList_of_ports() {
        return list_of_ports;
    }

    public void setList_of_ports(Integer list_of_ports) {
        this.list_of_ports = list_of_ports;
    }

    public String getTypeHdmiPort() {
        return typeHdmiPort;
    }

    public void setTypeHdmiPort(String typeHdmiPort) {
        this.typeHdmiPort = typeHdmiPort;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", list_of_ports=" + list_of_ports +
                ", typeHdmiPort='" + typeHdmiPort + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monitor monitor = (Monitor) o;

        return Objects.equals(id, monitor.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}