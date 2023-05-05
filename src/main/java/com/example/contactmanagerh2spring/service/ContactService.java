package com.example.contactmanagerh2spring.service;

import com.example.contactmanagerh2spring.model.Contact;
import com.example.contactmanagerh2spring.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactService {

    private static final Logger logger = LoggerFactory.getLogger(ContactService.class);

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
        try{
            return (List<Contact>) contactRepository.findAll();
        }
        catch (Exception e){
            logger.error("Error while fecting all contacts", e);
            return null;
        }
    }

    public Contact createContact(Contact contact) {
        try{
            return contactRepository.save(contact);
        }
        catch (Exception e){
            logger.error("Error while creating new contact", e);
            return null;
        }
    }

    public List<Contact> findByAddressZipCode(String zipCode) {

        try{
            List<Contact> zipCodeContactList = contactRepository.findByAddressZipCode(zipCode);

            //Only return a max of 3 results for a zip code
            return zipCodeContactList.stream().limit(3).collect(Collectors.toList());
        }
        catch (Exception e){
            logger.error("Error while getting contacts by zipCode", e);
            return null;
        }
    }
}
