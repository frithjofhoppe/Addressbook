package com.swisscode.Addressbook.service;

import com.swisscode.Addressbook.dao.OwnerDao;
import com.swisscode.Addressbook.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService
{
    @Autowired
    OwnerDao ownerDao;

    public void createOwner(Owner owner)
    {
        ownerDao.save(owner);
    }

    public void deleteOwner(Long id)
    {
        ownerDao.delete(id);
    }

    public Owner getOwner(Long id)
    {
        return ownerDao.findOne(id);
    }

    public void updateOwner(Owner owner)
    {
        Iterable<Owner> ownerIterable = ownerDao.findAll();

        for(Owner o: ownerIterable)
        {
            if(o.getId().equals(owner.getId()))
            {
                ownerDao.save(owner);
                break;
            }
        }
    }
}
