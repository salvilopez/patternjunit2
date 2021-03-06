package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        System.out.println("Multiplicación");
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    void sumTest(){
        Calculator calc = new Calculator();
        System.out.println("Suma");
        assertEquals(10,calc.sum(5,5));
    }


    @Test
    void subTest(){
        System.out.println("Resta");
        Calculator calc = new Calculator();
        assertEquals(4,calc.rest(10,6));
    }
}