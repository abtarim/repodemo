package com.softesteam.repodemo.calcoperations;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdditionTest {
    private static Addition addition;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        addition = new Addition();
    }

    @Test
    @DisplayName("Addition")
    @Order(1)
    void testAddition() {
        int a = 10;
        int b = 20;
        int expected = 35;

        int actual = addition.add(a,b);

        assertEquals(expected, actual, "Addition should return 30");
    }

}