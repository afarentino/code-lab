package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTwoNumbersTest {

    @Test
    void shouldMultiplyFloats() {
        //Arrange
        float first = 1.5f;
        float second = 2.0f;
        //Act
        float product = MultiplyTwoNumbers.multiplyFloats(first, second);

        //Assert
        assertEquals(3.0, product);
    }
}