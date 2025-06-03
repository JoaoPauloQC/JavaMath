package com.math;

import java.util.Random;

public class Math {

    public static boolean isNegative(double num1){
        return !(num1 > 0);

    }

    public static void sum(double num1,double num2){
        double result = num1 + num2;
        if (result >= 0) {
            System.out.println(result);
        }
        else{
            System.out.println("A soma é negativa:" + result);
        }
    }

    public static void multiply(double num1, double num2){
        if ((num1 * num2) > 0) {
            System.out.println(num1 * num2);
        }
        else {
            System.out.println("A multiplicação é negativa:" + (num1 * num2));
        }
    }

    public static void subtract(double num1 , double num2){
        double result = num1 - num2;
        if (result >= 0){
            System.out.println(result);
        }
        else {
            System.out.println("A subtração é negativa:" + result);
        }
    }

    public static void divide(double num1, double num2){
        double result = num1 - num2;
        if (result >= 0){
            System.out.println(result);
        }
        else {
            System.out.println("A subtração é negativa:" + result);
        }
    }

    public static void infinitesum(double num1, int times , double incrementer ){

        int i = 0;
        if(times < 0){
            System.out.println("Can´t be negative");
        }
        else {
            while (i < times) {
                num1 += incrementer;
                i++;
            }

            System.out.println(num1);

        }
    }

    public static void infinitesum(double num1, int times , double incrementer, double limiter ){

        int i = 0;
        if(times < 0){
            System.out.println("Can´t be negative");
        }
        else {
            while (i < times) {
                num1 += incrementer;
                if ( num1 >= limiter ){
                    break;
                }
                i++;
            }

            System.out.println(num1);

        }
    }

    public static double generate(double init, double limit){
        Random generate = new Random();
        double number = generate.nextDouble(init,limit);
        return number;
    }

    public static int generate(int init, int limit){
        Random generate = new Random();
        int number = generate.nextInt(init,limit);
        return number;
    }


}
