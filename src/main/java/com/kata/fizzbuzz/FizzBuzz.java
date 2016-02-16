package com.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;

    public FizzBuzz() {
        super();
    }

    public List<String> proceed(int n) {
        List<String> items = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            items.add(getFizzBuzzValue(i));
        }

        return items;
    }

    private String getFizzBuzzValue(int i) {
        if (i % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (i % 3 == 0) {
            return FIZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        } else {
            return "" + i;
        }
    }

}
