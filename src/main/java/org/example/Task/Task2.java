package org.example.Task;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
//2.	Bir növbə yaradın və bilet alan insanların adlarını əlavə edin.
// Hər bilet alanda həmin şəxsi növbədən çıxarın və qalan insanları ekrana yazdırın.


        Queue<String> queue = new PriorityQueue<>();
        queue.add("Elvin");
        queue.add("Elnur");
        queue.add("Senan");
        queue.add("Ramil");
        System.out.println("Bilet alanlarin siyahisi : " + queue);

        while (!queue.isEmpty()) {
            String novbedekiAdam = queue.poll();
            System.out.println(novbedekiAdam);
            System.out.println(queue);

        }

    }


}

