package com.softesteam.repodemo.calcoperations;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MultiplicationTest {
    private static Multiplication multiplication;

    @BeforeAll
    static void setUpBeforeClass(){
        multiplication = new Multiplication();
    }

    @Test
    @DisplayName("Multiplication")
    @Order(1)
    void testMultiplication() {
        int a = 20;
        int b = 10;
        int expected = 200;

        int actual = multiplication.multiplication(a, b);

        assertEquals(expected, actual, "Multiplication should return 200");
    }
}
