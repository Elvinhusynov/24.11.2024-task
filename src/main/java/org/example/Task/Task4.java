package org.example.Task;

import java.util.ArrayDeque;

public class Task4 {
    public static void main(String[] args) {

//4.	Bir Deque yaradın və vəzifələri sıralayın.Vəzifələri həm başdan,
// həm də sondan silmə funksiyasını istifadə edərək sıralanmış vəziyyətdə çap edin.

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("vezife 1");
        deque.add("vezife 2");
        deque.add("vezife 3");
        deque.add("vezife 4");
        deque.add("vezife 5");

        System.out.println("Vezifelerin siyahisi :" + deque);

        String delete1 = deque.pollFirst();
        String delete2 = deque.pollLast();

        System.out.println("Silinen birinci vezife - " + delete1);
        System.out.println("Silinen ikinci vezife - " + delete2);

        System.out.println("Vezifelerin siyahisi :" + deque);







    }
}
