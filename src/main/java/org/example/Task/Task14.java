package org.example.Task;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {
    public static void main(String[] args) {
//14.	Bir ArrayList yaradın və elementlər əlavə edin: "A", "B", "C", "D", "E".
// Collections.swap() metodundan istifadə edərək ikinci və
// dördüncü elementlərin yerini dəyişin.Nəticəni çap edin.

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Elementler " + list);

        Collections.swap(list, 1, 3);

        System.out.println("Deyishildikden sonra " + list);



    }
}
