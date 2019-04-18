package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_return_1_2_3(){
        assertEquals(fizzBuzz.answer(2),"2");
    }

    @Test
    public void should_return_Fizz_when_division3(){
        assertEquals(fizzBuzz.answer(6),"Fizz");
    }

    @Test
    public void should_return_Buzz_when_division5(){
        assertEquals(fizzBuzz.answer(5),"Buzz");
    }

    @Test
    public void should_return_Whizz_when_division7(){
        assertEquals(fizzBuzz.answer(7),"Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_division3_5(){
        assertEquals(fizzBuzz.answer(15),"FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzz_when_division5_7(){
        assertEquals(fizzBuzz.answer(35),"BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzz_when_division3_7(){
        assertEquals(fizzBuzz.answer(21),"FizzWhizz");
    }

    @Test
    public void should_return_FizzBuzz_when_division3_5_7(){
        assertEquals(fizzBuzz.answer(105),"FizzBuzzWhizz");
    }

}
