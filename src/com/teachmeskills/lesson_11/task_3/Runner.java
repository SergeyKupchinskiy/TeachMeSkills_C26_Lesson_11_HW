package com.teachmeskills.lesson_11.task_3;

import com.teachmeskills.lesson_11.task_3.doubleLetterMethod.DoubleLetter;

/**
 * An arbitrary string is given.
 * Print a new line to the console, which duplicates each letter from
 * starting line.
 * For example, "Hello" -> "HHeelllloo".
 */

public class Runner {
    public static void main(String[] args) {

        String str = "My precious";

        System.out.println(str);

        DoubleLetter.doMethod(str);
    }
}
