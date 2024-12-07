package org.example.Task;

import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {
//9.HashSet istifadə edərək unikal şagirdlərin adlarını saxlayın.
// Şagirdlərin siyahısını çap edin.

        HashSet<String> set = new HashSet<>();
        set.add("Elvin");
        set.add("Ramil");
        set.add("Senan");
        set.add("Vasif");
        set.add("Elvin");
        set.add("Ramil");
        set.add("Senan");
        set.add("Vasif");
        System.out.println("Sagirlerin siyahisi - " + set);

    }
}
