package com.softesteam.repodemo.calcoperations;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdditionTest {
    private static Addition addition;

    @BeforeAll
    static void setUpBeforeClass(){
        addition = new Addition();
    }

    @Test
    @DisplayName("Addition")
    @Order(1)
    void testAddition() {
        double a = 10;
        double b = 20;
        double expected = 30;

        double actual = addition.add(a, b);

        assertEquals(expected, actual, "Addition should return 30");
    }

}