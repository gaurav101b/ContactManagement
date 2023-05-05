package com.example.contactmanagerh2spring.service;

import com.example.contactmanagerh2spring.model.Contact;
import com.example.contactmanagerh2spring.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ContactService {

//    private static List<Contact> contactList = new ArrayList<>();
//
//    static {
//        contactList.add( new Contact("AAA Kumar", LocalDate.of(1980, 1, 1)));
//        contactList.add( new Contact("BBB Kumar", LocalDate.of(1980, 1, 1)));
//        contactList.add( new Contact("CCC Kumar", LocalDate.of(1980, 1, 1)));
//    }

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return (List<Contact>) contactRepository.findAll();
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
