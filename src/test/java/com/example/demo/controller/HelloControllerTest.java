package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest {

    HelloController helloController;

    @Autowired
    HelloControllerTest(HelloController helloController){
        this.helloController = helloController;
    }

    @Test
    @DisplayName("Get Hello")
    void hello() {
        Assertions.assertEquals("Hello", helloController.hello());
    }

    @Test
    @DisplayName("Get World")
    void world() {
        Assertions.assertEquals("", helloController.world());
    }
}