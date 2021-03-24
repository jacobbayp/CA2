package dtos;


import entities.CityInfo;
import java.util.Objects;



public class CityInfoDTO {

    private int id;
    private String zipCode;
    private String city;

    public CityInfoDTO(int id, String zipCode, String city) {
        this.id = id;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }    

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CityInfoDTO(CityInfo cityInfo) {
        this.id = cityInfo.getId();
        this.zipCode = cityInfo.getZipcode();
        this.city = cityInfo.getCity();
    }
}
