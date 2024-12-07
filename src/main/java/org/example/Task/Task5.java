package org.example.Task;

import java.util.Locale;
import java.util.Stack;

public class Task5 {
    public static void main(String[] args) {
//5.	Bir Stack yaradaraq mətni hər bir hərfə bölün.
// Hərfləri yığına əlavə edin və tərsinə çevrilmiş mətni ekrana yazdırın

        String metn = "Salam dunya";
        Stack<Character> stack = new Stack<>();

        for (char a : metn.toCharArray()){
            stack.add(a);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        System.out.println("Metn - " + metn);
        System.out.println("Chevrilmish metn - " + stringBuilder);


    }
}
