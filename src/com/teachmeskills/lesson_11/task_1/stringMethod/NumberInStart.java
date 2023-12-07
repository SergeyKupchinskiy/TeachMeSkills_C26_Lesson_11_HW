package com.teachmeskills.lesson_11.task_1.stringMethod;

public class NumberInStart {
    public static void doMethod(String documentNumber){

        if(documentNumber.startsWith("555")){
            System.out.println("This string starts with '555'");
        }
        else {
            System.out.println("This string doesn't start with '555'");
        }
    }
}
