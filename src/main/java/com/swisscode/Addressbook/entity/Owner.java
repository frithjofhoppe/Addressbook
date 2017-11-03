package com.swisscode.Addressbook.entity;

import javax.persistence.Id;
import java.util.List;

public class Owner
{
    @Id
    Long id;
    String firstName;
    String lastName;
    String email;
    String password;
    List<Adressbook> adressbooks;

    public Owner() {
    }

    public Owner(Long id, String firstName, String lastName, String email, String password, List<Adressbook> adressbooks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.adressbooks = adressbooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Adressbook> getAdressbooks() {
        return adressbooks;
    }

    public void setAdressbooks(List<Adressbook> adressbooks) {
        this.adressbooks = adressbooks;
    }
}
