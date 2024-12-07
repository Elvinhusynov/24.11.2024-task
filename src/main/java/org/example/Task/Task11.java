package org.example.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
//11.	Bir ArrayList yaradın və ona təsadüfi 10 rəqəm əlavə edin.
// Collections.sort() metodundan istifadə edərək rəqəmləri
// artan sıraya düzün və çap edin.Sonra Collections.reverse() metodundan
// istifadə edərək siyahını azalan sıraya çevirin və çap edin.


        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Tesadufi sechilmish reqemler - " + list);

        Collections.sort(list);
        System.out.println("Artan sira ile reqemler - " + list);

        Collections.reverse(list);
        System.out.println("Azalan sira ile reqemler - " + list);


    }
}
