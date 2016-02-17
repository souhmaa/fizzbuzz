package com.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import static com.kata.fizzbuzz.Constants.*;

public class FizzBuzz {

    public FizzBuzz() {
        super();
    }

    public List<String> proceed(int arg) {
        List<String> elements = new ArrayList<String>();
        for (int i = 1; i <= arg; i++) {
            elements.add(getFizzBuzzValue(i));
        }

        return elements;
    }

    private String getFizzBuzzValue(int number) {
        if (number % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        } else {
            return String.valueOf(number);
        }
    }

}
