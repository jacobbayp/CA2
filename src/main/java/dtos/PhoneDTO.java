package dtos;


import entities.Phone;
import java.util.Objects;


public class PhoneDTO {

    private Integer id;
    private String number;
    private String description;

    public PhoneDTO(Integer id, String number, String description) {
        this.id = id;
        this.number = number;
        this.description = description;
    }

    public PhoneDTO(Phone p) {
        this.id = p.getId();
        this.number = p.getNumber();
        this.description = p.getDescription();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}