package com.teachmeskills.lesson_11.task_1.stringMethod;

public class LetterInHigherCase {
    public static void doMethod(String documentNumber){

        StringBuilder stringBuilder =new StringBuilder(documentNumber);

        stringBuilder.delete(0, 5);
        stringBuilder.replace(3, 9, "/");
        stringBuilder.replace(7, 9, "/");
        stringBuilder.replace(9, 10, "/");
        stringBuilder.insert(0,"Letters: ");

        String result = stringBuilder.toString();
        System.out.println(result.toUpperCase());
    }
}
