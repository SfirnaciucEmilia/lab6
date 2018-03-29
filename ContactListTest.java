package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactListTest {

    @Test
    void addContact() {
        String expectMesaj = "add";
        String msj = "add";
        Inbox instance = new Inbox();
        String mesaj=instance.delete(msj);
        assertEquals(mesaj,expectMesaj);
        System.out.println("A functionat add");
        // fail("Nu a mers");
    }

    @Test
    void removeContact() {
        String expectMesaj = "remove";
        String msj = "remove";
        ContactList instance = new ContactList();
        String mesaj=instance.removeContact(msj);
        assertEquals(mesaj,expectMesaj);
        System.out.println("A functionat remove");
        // fail("Nu a mers");
    }

    @Test
    void searchContact() {
    }

    @Test
    void getContact() {
    }
}