package com.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    static Stream<Arguments> addData(){
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(5,8,13),
                Arguments.of(20,9,29),
                Arguments.of(100,36,136),
                Arguments.of(1050,30,1080),
                Arguments.of(3,6,9),
                Arguments.of(18,3,21),
                Arguments.of(75,2,77),
                Arguments.of(0,9,9),
                Arguments.of(64,3,67)
        );
    }


    static Stream<Arguments> addNegativeData(){
        return Stream.of(
                Arguments.of(-1,3),
                Arguments.of(6,-9),
                Arguments.of(-11,-5),
                Arguments.of(-8,3),
                Arguments.of(-100,7)
        );
    }


    @ParameterizedTest
    @MethodSource("addData")
    void testAdd(int num1 , int num2 , int expected){
        Calculator calculator = new Calculator();
        int result = calculator.add(num1,num2);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @MethodSource("addNegativeData")
    void testAddNegativeNumberShouldThrowException(int num1 , int num2){
        Calculator calculator = new Calculator();
        try {
            int result = calculator.add(num1,num2);
            Assertions.fail("positive numbers only");
        }catch (RuntimeException e ){

        }
    }

}
