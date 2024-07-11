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
        double a = 20;
        double b = 10;
        double expected = 200;

        double actual = multiplication.multiplication(a, b);

        assertEquals(expected, actual, "Multiplication should return 200");
    }
}
