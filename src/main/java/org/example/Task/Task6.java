package org.example.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
//6.ArrayList-dən istifadə edərək 10 ədəd təsadüfi rəqəm əlavə edin.
// Rəqəmləri kiçikdən böyüyə düzün və ekrana çap edin

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));

            Collections.sort(list);

            System.out.println(list);

        }

    }
}
