package com.example.contactmanagerh2spring;

import com.example.contactmanagerh2spring.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.contactmanagerh2spring.model.*;
import com.example.contactmanagerh2spring.repository.ContactRepository;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class ContactDataLoader implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ContactDataLoader.class);

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try{
            Address address1 = new Address("123 Main Road", "Delhi", "123456");
            Contact contact1 = new Contact("Ram Kumar", LocalDate.of(1980, 1, 1), address1);

            Address address2 = new Address("456 Marine Drive", "Mumbai", "333666");
            Contact contact2 = new Contact("Anjali Rawat", LocalDate.of(1990, 2, 2), address2);

            contactRepository.saveAll(Arrays.asList(contact1, contact2));

        }
        catch (Exception e){
            logger.error("Error while populating data at application start", e);
        }
    }
}
