package com.swisscode.Addressbook.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Adressbook
{
    Long id;
    String adressBookIdentifier;
    Owner owner;
    List<Contact> contactlist;

    public Adressbook() {
    }

    public Adressbook(String adressBookIdentifier, Owner owner, List<Contact> contactlist) {
        this.adressBookIdentifier = adressBookIdentifier;
        this.owner = owner;
        this.contactlist = contactlist;
    }

    public String getAdressBookIdentifier() {
        return adressBookIdentifier;
    }

    public void setAdressBookIdentifier(String adressBookIdentifier) {
        this.adressBookIdentifier = adressBookIdentifier;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }
}
