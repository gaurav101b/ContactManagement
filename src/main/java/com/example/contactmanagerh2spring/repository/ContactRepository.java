package com.example.contactmanagerh2spring.repository;

import com.example.contactmanagerh2spring.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

    List<Contact> findByAddressZipCode(String zipCode);
}
