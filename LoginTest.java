package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void login() {
        System.out.println("toString");
        Login instance = new Login();
        String expResult = "asdf";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}