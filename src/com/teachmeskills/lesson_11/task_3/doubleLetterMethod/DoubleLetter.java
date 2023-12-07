package com.teachmeskills.lesson_11.task_3.doubleLetterMethod;

public class DoubleLetter {

    public static void doMethod(String str){

        char[] chars = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char i : chars){
            stringBuilder.append(i);
            stringBuilder.append(i);
        }

        String newStr = stringBuilder.toString();
        System.out.println(newStr);
    }

}
