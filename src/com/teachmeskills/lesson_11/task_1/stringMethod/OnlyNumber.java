package com.teachmeskills.lesson_11.task_1.stringMethod;

public class OnlyNumber {
    public static void doMethod(String documentNumber){

        String[] str = documentNumber.split("-");

        System.out.println(str[0] + str[2]);
    }
}
