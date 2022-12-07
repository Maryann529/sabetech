package dwit.sabetech.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.boot.jackson.JsonObjectSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.Objects;

public class BaseModel {

    private String brand;
    @Override
    public String toString() {
        try{

            ByteArrayOutputStream Byte_Array_Output_Stream = new ByteArrayOutputStream();
            ObjectOutputStream Object_Output_Stream = new ObjectOutputStream( Byte_Array_Output_Stream );
            Object_Output_Stream.writeObject( this );
            Object_Output_Stream.close();
            return Base64.getEncoder().encodeToString(Byte_Array_Output_Stream.toByteArray());
        }
        catch (Exception ex){
            return super.toString();
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return this.toString().equalsIgnoreCase(o.toString());
    }
}
