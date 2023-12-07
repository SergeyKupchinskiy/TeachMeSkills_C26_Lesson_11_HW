package com.teachmeskills.lesson_11.task_1.stringMethod;

public class NumberAndStar {
    public static void doMethod(String documentNumber){

        String str = documentNumber.replace("src","***");
        String str1 = str.replace("tms","***");

        System.out.println(str1);
    }
}
