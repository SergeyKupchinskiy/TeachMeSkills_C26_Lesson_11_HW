package com.teachmeskills.lesson_11.task_1.stringMethod;

public class NumberAndLetterEnd {
    public static void doMethod(String documentNumber){

        if(documentNumber.endsWith("1a2b")){
            System.out.println("This string ends with '1a2b'");
        }
        else {
            System.out.println("This string doesn't ends with '1a2b'");
        }
    }
}
