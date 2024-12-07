package org.example.Task;

import java.util.ArrayList;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
//15.	İki ArrayList yaradın (biri boş).Collections.copy()
// metodundan istifadə edərək bir siyahının elementlərini digərinə kopyalayın.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = new ArrayList<>(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            list2.add(null);
        }

        Collections.copy(list2 , list1);

        System.out.println(list2);


    }
}
