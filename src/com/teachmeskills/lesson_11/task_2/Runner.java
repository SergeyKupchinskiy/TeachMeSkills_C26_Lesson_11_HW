package com.teachmeskills.lesson_11.task_2;

import com.teachmeskills.lesson_11.task_2.method.ShortestWord;
import com.teachmeskills.lesson_11.task_2.method.LongestWord;

/**
 * Given a string of arbitrary length with arbitrary words.
 * Find the shortest word in a line and display it on the screen.
 * Find the longest word in a line and display it on the screen.
 * If there are several such words, then print the last one.
 */

public class Runner {

    public static void main(String[] args) {

        String str = "One ring to rule them all," +
                "\none ring to find them," +
                "\nOne ring to bring them all" +
                "\nand in the darkness bind them.";

        System.out.println(str);
        System.out.println();

        ShortestWord.doMethod(str);
        LongestWord.doMethod(str);

    }
}
