package com.kata.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static com.kata.fizzbuzz.Constants.*;

public class FizzBuzzTest {

    // -------------------------------------------------------------------------
    // given argument <= 0, should return an empty list
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzGivenNegativeShouldReturEmptyList() {
        int given = 0;

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.proceed(given);

        Assert.assertTrue(result.size() == 0);
    }

    // -------------------------------------------------------------------------
    // given 3, should return 1, 2 and Fizz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzShouldReturnThreeItems() {
        int given = 3;
        int expectedSize = 3;
        List<String> expected = Arrays.asList("1", "2", FIZZ);

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.proceed(given);

        Assert.assertEquals(expectedSize, result.size());
        Assert.assertEquals(expected, result);
    }

    // -------------------------------------------------------------------------
    // given 5, should return 1, 2, Fizz, 4 and Buzz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzShouldReturnFiveItems() {
        int given = 5;
        int expectedSize = 5;
        List<String> expected = Arrays.asList("1", "2", FIZZ, "4", BUZZ);

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.proceed(given);

        Assert.assertEquals(expectedSize, result.size());
        Assert.assertEquals(expected, result);
    }

    // -------------------------------------------------------------------------
    // given 10, should return 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzShouldReturnTenItems() {
        int given = 10;
        int expectedSize = 10;
        List<String> expected = Arrays.asList("1", "2", FIZZ, "4", BUZZ, FIZZ,
                "7", "8", FIZZ, BUZZ);

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.proceed(given);

        Assert.assertEquals(expectedSize, result.size());
        Assert.assertEquals(expected, result);
    }

    // -------------------------------------------------------------------------
    // given 15, last element of the result list should be Fizz Buzz
    // -------------------------------------------------------------------------

    @Test
    public void testFizzBuzzGiven15SouhldReturnFizzBuzz() {
        int given = 15;
        int expectedSize = 15;

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.proceed(given);

        Assert.assertEquals(expectedSize, result.size());
        Assert.assertEquals(FIZZ_BUZZ, result.get(expectedSize - 1));
    }

}
