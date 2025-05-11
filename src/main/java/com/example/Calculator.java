package com.example;

public class Calculator {

    int add(int number1,int number2){
        if(number1 < 0  || number2 < 0){
            throw new RuntimeException("positive numbers only");
        }
        return number1 + number2;
    }

}
