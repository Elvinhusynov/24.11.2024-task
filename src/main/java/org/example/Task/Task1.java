package org.example.Task;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {

//Bir tələbə növbəsi yaradın (Queue interfeysindən istifadə edərək).
// Növbəyə 5 tələbənin adını əlavə edin. İlk iki tələbəni növbədən çıxarın və
// qalan növbəni çap edin.

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Elvin");
        queue.add("Elnur");
        queue.add("Cavid");
        queue.add("Fariz");
        queue.add("Senan");

        System.out.print("Telebe novbesi: " + queue);
        System.out.println();

        String telebe1 = queue.remove();
        System.out.println(telebe1 + " silindi");
        System.out.println(queue);
        String telebe2 = queue.remove();
        System.out.println(telebe2 + " silindir");
        System.out.println(queue);


    }
}
