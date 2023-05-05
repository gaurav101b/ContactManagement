package com.example.contactmanagerh2spring.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void getAddressLine() {
        Address address = new Address("123 Main Street", "Delhi", "10001");
        assertEquals("123 Main Street", address.getAddressLine());
    }

    @Test
    void getCity() {
        Address address = new Address("123 Main Street", "Delhi", "10001");
        assertEquals("Delhi", address.getCity());
    }

    @Test
    void getZipCode() {
        Address address = new Address("123 Main Street", "Delhi", "10001");
        assertEquals("10001", address.getZipCode());
    }

    @Test
    void setAddressLine() {
        Address address = new Address();
        address.setAddressLine("123 Main Street");
        assertEquals("123 Main Street", address.getAddressLine());
    }

    @Test
    void setCity() {
        Address address = new Address();
        address.setCity("Delhi");
        assertEquals("Delhi", address.getCity());
    }

    @Test
    void setZipCode() {
        Address address = new Address();
        address.setZipCode("10001");
        assertEquals("10001", address.getZipCode());
    }
}

