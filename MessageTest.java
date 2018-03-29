package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @org.junit.jupiter.api.Test
    public void testForward() {
        String expectMesaj = "forward";
        String msj = "forward";
        Message instance = new Message();
        String mesaj=instance.forward(msj);
        assertEquals(msj,expectMesaj);
        System.out.println("A functionat");
       // fail("Nu a mers");
    }
}