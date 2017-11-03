package com.swisscode.Addressbook.dao;

import com.swisscode.Addressbook.entity.Adressbook;
import org.springframework.data.repository.CrudRepository;

public interface AdressbookDao extends CrudRepository<Adressbook, Long>{
}
