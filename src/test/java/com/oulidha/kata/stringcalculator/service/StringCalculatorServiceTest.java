package com.oulidha.kata.stringcalculator.service;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringCalculatorServiceTest {

    @Test
    public void should_return_0_when_empty_string(){
        //given
        StringCalculatorService stringCalculatorService = new StringCalculatorService();
        String input = "";

        //when
        int result = stringCalculatorService.add(input);
        //then
        assertThat(result).isEqualTo(0);
    }
}
