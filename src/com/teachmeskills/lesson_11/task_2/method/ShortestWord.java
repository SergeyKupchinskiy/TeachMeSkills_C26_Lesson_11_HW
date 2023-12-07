package com.teachmeskills.lesson_11.task_2.method;

public class ShortestWord {

    public static void doMethod(String string){

        String[] wordsArray = string.split("\\s");
        String shortestWord = wordsArray[0];

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() < shortestWord.length()){
                shortestWord = wordsArray[i];
            }

        }

        System.out.println("The shortest word in this text is '" + shortestWord + "'");
    }
}
