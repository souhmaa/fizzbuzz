package com.kata.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    // -------------------------------------------------------------------------
    // given 3, should return 1, 2 and Fizz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzShouldReturnThreeItems() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> expected = Arrays.asList("1", "2", "Fizz");
        List<String> actual = fizzBuzz.proceed(3);
        Assert.assertEquals(expected, actual);
    }

    // -------------------------------------------------------------------------
    // given 5, should return 1, 2, Fizz, 4 and Buzz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzShouldReturnFiveItems() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        List<String> actual = fizzBuzz.proceed(5);
        Assert.assertEquals(expected, actual);
    }

    // -------------------------------------------------------------------------
    // given 15, last element of the result should be Fizz Buzz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzGiven15SouhldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int position = 15;
        List<String> actual = fizzBuzz.proceed(position);

        Assert.assertEquals(actual.get(position - 1), "Fizz Buzz");

    }

}
