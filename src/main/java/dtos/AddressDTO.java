package dtos;

import entities.Address;
import java.util.Objects;



public class AddressDTO {

    private Integer id;
    private String street;

    public AddressDTO(Integer id, String street) {
        this.id = id;
        this.street = street;
    }

    public AddressDTO(Address a) {
        this.id = a.getId();
        this.street = a.getStreet();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}