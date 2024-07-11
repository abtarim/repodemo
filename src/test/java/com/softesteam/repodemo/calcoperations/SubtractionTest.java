package com.softesteam.repodemo.calcoperations;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SubtractionTest {
    private static Subtraction subtraction;

    @BeforeAll
    static void setUpBeforeClass(){
        subtraction = new Subtraction();
    }

    @Test
    @DisplayName("Subtraction")
    @Order(1)
    void testSubtraction() {
        int a = 20;
        int b = 10;
        int expected = 10;

        int actual = subtraction.subtraction(a, b);

        assertEquals(expected, actual, "Subtraction should return 30");
    }
}
