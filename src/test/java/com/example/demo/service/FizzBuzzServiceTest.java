package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FizzBuzzServiceTest {

//    @Test
//    public void failingTest(){
//        FizzBuzzService fizzBuzzService = new FizzBuzzService();
//
//        assertEquals("Fizz",fizzBuzzService.validation(3));
//    }

    @Test
    public void fizzTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        assertEquals("Fizz",fizzBuzzService.validation(3));
        assertEquals("Fizz",fizzBuzzService.validation(33));
        assertEquals("Fizz",fizzBuzzService.validation(9));
    }

    @Test
    public void buzzTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        assertEquals("Buzz",fizzBuzzService.validation(5));
        assertEquals("Buzz",fizzBuzzService.validation(55));
        assertEquals("Buzz",fizzBuzzService.validation(25));
    }

    @Test
    public void fizzBuzzTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        assertEquals("FizzBuzz",fizzBuzzService.validation(15));
        assertEquals("FizzBuzz",fizzBuzzService.validation(30));
        assertEquals("FizzBuzz",fizzBuzzService.validation(9000000));
    }

    @Test
    public void nonValueTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        assertEquals("1",fizzBuzzService.validation(1));
        assertEquals("11",fizzBuzzService.validation(11));
        assertEquals("41",fizzBuzzService.validation(41));
    }

    // exception - unit tests
    // special characters validation tests..
}


/**

 TDD - RED-GREEN-BLUE

 */