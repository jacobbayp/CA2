package dtos;

import entities.Hobby;
import entities.Person;
import entities.Phone;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PersonDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String zipCode;
    private String city;
    private List<PhoneDTO> phones;
    private List<HobbyDTO> hobbies;

    public PersonDTO(int id, String firstName, String lastName, String email, String street, String zipCode, String city, List<PhoneDTO> phones, List<HobbyDTO> hobbies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.phones = phones;
        this.hobbies = hobbies;
    }

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.street = person.getAddress().getStreet();
        this.zipCode = person.getAddress().getCityInfo().getZipcode();
        this.city = person.getAddress().getCityInfo().getCity();
        this.phones = new ArrayList<>();
        for (Phone ph : person.getPhones()) {
            PhoneDTO phDTO = new PhoneDTO(ph);
            this.phones.add(phDTO);
        }
        this.hobbies = new ArrayList<>();
        for (Hobby h : person.getHobbies()) {
            HobbyDTO hDTO = new HobbyDTO(h);
            this.hobbies.add(hDTO);
        }

    }
}