package com.swisscode.Addressbook.dao;

import com.swisscode.Addressbook.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactDao extends CrudRepository<Contact, Long> {
}
