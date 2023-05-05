package com.example.contactmanagerh2spring.controller;

import com.example.contactmanagerh2spring.model.Contact;
import com.example.contactmanagerh2spring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {

        return ResponseEntity.of(Optional.of(contactService.getAllContacts()));
    }

    @GetMapping(params = "zipCode")
    public List<Contact> getContactsByZipCode(@RequestParam String zipCode) {
        return contactService.findByAddressZipCode(zipCode);
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        try{
            Contact c = contactService.createContact(contact);
            return ResponseEntity.status(HttpStatus.CREATED).body(c);
        }
        catch (Exception e){
            //LOG

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}

