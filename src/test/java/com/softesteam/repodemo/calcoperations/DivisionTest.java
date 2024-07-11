package com.softesteam.repodemo.calcoperations;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DivisionTest {
    private static Division division;

    @BeforeAll
    static void setUpBeforeClass(){
        division = new Division();
    }

    @Test
    @DisplayName("Division")
    @Order(1)
    void testDivision() {
        double a = 20;
        double b = 10;
        double expected = 2;

        double actual = division.division(a, b);

        assertEquals(expected, actual, "Division should return 200");
    }
}
