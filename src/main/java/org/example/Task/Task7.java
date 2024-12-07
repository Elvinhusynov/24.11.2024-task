package org.example.Task;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
//7.Bir Set yaradaraq ədədləri daxil edin.
// Təkrarlanan ədədləri avtomatik olaraq silin və unikal elementləri çap edin.

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(7);
        System.out.println("Unikal elementler - " + set);


    }
}
