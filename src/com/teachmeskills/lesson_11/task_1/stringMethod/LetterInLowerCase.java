package com.teachmeskills.lesson_11.task_1.stringMethod;

public class LetterInLowerCase {
    public static void doMethod(String documentNumber){

        String str = documentNumber.replace("1234","");
        String str1 = str.replace("5678","");
        String str2 = str1.replace("9","");
        String str3 = str2.replace("0","/");
        String str4 = str3.replace("-","/");
        String str5 = str4.replace("//","/");
        String str6 = str5.substring(1);

        System.out.println(str6.toLowerCase());
    }
}
