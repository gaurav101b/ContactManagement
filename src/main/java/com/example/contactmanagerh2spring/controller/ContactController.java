package com.example.contactmanagerh2spring.controller;

import com.example.contactmanagerh2spring.model.Contact;
import com.example.contactmanagerh2spring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

//    @GetMapping("/{zipCode}")
//    public List<Contact> getContactsByZipCode(@PathVariable String zipCode) {
//        return contactRepository.findByAddressZipCode(zipCode);
//    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

}

