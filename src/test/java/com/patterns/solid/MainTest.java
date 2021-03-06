package com.patterns.solid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {


    @Test
    @DisplayName("carnotNull")
    public void carnotNull() {
        Car car = new Car();
        assertTrue(car!=null);

    }




}