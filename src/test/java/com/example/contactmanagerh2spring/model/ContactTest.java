package com.example.contactmanagerh2spring.model;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContactTest {

    @Test
    public void testConstructorAndGetters() {
        Address address = new Address("123 Main St", "Delhi", "10001");
        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);
        Contact contact = new Contact("Ram Kishore", dateOfBirth, address);

        assertNotNull(contact);
        assertEquals("Ram Kishore", contact.getFullName());
        assertEquals(dateOfBirth, contact.getDateOfBirth());
        assertEquals(address, contact.getAddress());
    }

    @Test
    public void testSetters() {
        Address address1 = new Address("123 Main St", "Delhi", "10001");
        Address address2 = new Address("456 Broadway", "Delhi", "10002");
        LocalDate dateOfBirth1 = LocalDate.of(1990, 1, 1);
        LocalDate dateOfBirth2 = LocalDate.of(1995, 2, 2);
        Contact contact = new Contact("Ram Kishore", dateOfBirth1, address1);

        contact.setFullName("Ram Kishore");
        contact.setDateOfBirth(dateOfBirth2);
        contact.setAddress(address2);

        assertEquals("Ram Kishore", contact.getFullName());
        assertEquals(dateOfBirth2, contact.getDateOfBirth());
        assertEquals(address2, contact.getAddress());
    }
}
