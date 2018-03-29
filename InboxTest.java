package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InboxTest {

    @Test
    void refresh() {
    }

    @Test
    void move() {
    }

    @Test
    void delete() {
        String expectMesaj = "delete";
        String msj = "delete";
        Inbox instance = new Inbox();
        String mesaj=instance.delete(msj);
        assertEquals(mesaj,expectMesaj);
        System.out.println("A functionat delete");
        // fail("Nu a mers");
    }

    @Test
    void markAsRead() {
        String mesaj = "fisier";
        int expectedResult=1;
        Inbox inb = new Inbox();
        int result=inb.markAsRead(mesaj);
        assertEquals(result,expectedResult);
        System.out.println("A functionat markAsRead");
        //fail("nu a functionat");
    }
}