package com.oulidha.kata.stringcalculator.service;

import java.util.Collections;

/**
 * Created by ahidri on 14/04/2017.
 */
public class StringCalculatorService {
    public int add(String numbers) {
        if ("".equals(numbers)){
            return 0;
        }
        return Integer.parseInt(numbers);
    }
}
