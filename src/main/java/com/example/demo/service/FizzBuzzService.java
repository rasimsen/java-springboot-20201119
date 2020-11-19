package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public String validation(int i) {
        if (i % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        } else if (i % 3 == 0) {
            return FIZZ;
        }

        return String.valueOf(i);
    }
}
