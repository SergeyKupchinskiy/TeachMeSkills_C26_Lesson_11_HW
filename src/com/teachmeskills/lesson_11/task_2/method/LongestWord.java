package com.teachmeskills.lesson_11.task_2.method;

public class LongestWord {

    public static void doMethod(String str){

        String[] wordsArray = str.split("\\s");
        String longestWord = wordsArray[0];

        for (int i = 1; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > longestWord.length()) {
                longestWord = wordsArray[i];
            }

        }

        System.out.println("The longest word in this text is '" + longestWord + "'");
    }
}

