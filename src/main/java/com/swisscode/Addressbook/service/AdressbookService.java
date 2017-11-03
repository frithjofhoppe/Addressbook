package com.swisscode.Addressbook.service;

import com.swisscode.Addressbook.dao.AdressbookDao;
import com.swisscode.Addressbook.entity.Adressbook;
import com.swisscode.Addressbook.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressbookService {

    @Autowired
    AdressbookDao adressbookDao;
    @Autowired
    OwnerService ownerService;

    public void deleteAdressbook(Long owner, String book)
    {
        Owner o = ownerService.getOwner(owner);
        if(o != null)
        {
           // o.get
        }
    }

    public List<Adressbook> getAddressbook(Long owner, String book)
    {
        return null;
    }

    public void createAdressbook(Adressbook adressbook, Long id) {
    }

    public void updateAdressbook(Adressbook adressbook, Long id, String book)
    {

    }
}
