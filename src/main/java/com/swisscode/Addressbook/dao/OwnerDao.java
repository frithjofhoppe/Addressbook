package com.swisscode.Addressbook.dao;

import com.swisscode.Addressbook.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerDao extends CrudRepository<Owner,Long>{
}
