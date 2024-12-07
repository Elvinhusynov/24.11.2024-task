package org.example.Task;

import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
//10.İki fərqli HashSet yaradın və rəqəmləri daxil edin.
// Hər iki cəmdə olan ortaq elementləri tapın və ekrana yazdırın.

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(7);
        set1.add(5);
        set1.add(4);
        set1.add(9);

        set2.add(7);
        set2.add(5);
        set2.add(4);
        set2.add(1);
        set2.add(10);

        HashSet<Integer> klon = new HashSet<>(set1);

        klon.retainAll(set2);

        System.out.println("Her iki cemde olan ortaq element - " + klon);


    }
}
