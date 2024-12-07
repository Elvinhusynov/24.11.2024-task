package org.example.Task;

import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args) {

//3.	Bir Deque yaradın və kitabların adlarını həm başa, həm də sonuna əlavə edin.
// Ən başdakı və ən sondakı kitabları silin və qalan kitabların adlarını çap edin.

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Kitab1");
        deque.add("Kitab2");
        deque.add("Kitab3");
        deque.add("Kitab4");

        System.out.println("Kitablarin siyahisi : " + deque);

        String delete1 = deque.pollFirst();
        String delete2 = deque.pollLast();

        System.out.println("En bashdaki silinen kitab : " + delete1);

        System.out.println("En sondaki silinen kitab : " + delete2);


        System.out.println("Kitablarin siyahisi : " + deque);


    }

}
