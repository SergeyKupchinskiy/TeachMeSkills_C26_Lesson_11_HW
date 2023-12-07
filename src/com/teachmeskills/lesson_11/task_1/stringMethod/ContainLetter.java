package com.teachmeskills.lesson_11.task_1.stringMethod;

public class ContainLetter {
    public static void doMethod(String documentNumber){

        if(documentNumber.contains("abc")){
            System.out.println("There is 'abc' in this string");
        }
        else{
            System.out.println("There is no 'abc' in this string");
        }
    }
}
