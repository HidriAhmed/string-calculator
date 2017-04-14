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

    @Test
    public void should_return_1_when_1(){
        //given
        StringCalculatorService stringCalculatorService = new StringCalculatorService();
        String input = "1";

        //when
        int result = stringCalculatorService.add(input);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_return_2_when_2(){
        //given
        StringCalculatorService stringCalculatorService = new StringCalculatorService();
        String input = "2";

        //when
        int result = stringCalculatorService.add(input);

        //then
        assertThat(result).isEqualTo(2);
    }
}
