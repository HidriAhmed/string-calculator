package com.oulidha.kata.stringcalculator.service;

/**
 * Created by ahidri on 14/04/2017.
 */
public class StringCalculatorService {
    public int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        } else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            String[] elements = numbers.split(",");
            return add(elements[0]) + add(elements[1]);
        }
    }
}
