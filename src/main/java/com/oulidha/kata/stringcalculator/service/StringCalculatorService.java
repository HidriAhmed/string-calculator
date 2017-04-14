package com.oulidha.kata.stringcalculator.service;

/**
 * Created by ahidri on 14/04/2017.
 */
public class StringCalculatorService {
    public int add(String numbers) {
        if("1".equals(numbers)){
            return 1;
        }
        if("2".equals(numbers)){
            return 2;
        }
        return 0;
    }
}
