package org.example.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
//12.	Bir ArrayList yaradın və rənglərin adlarını əlavə edin:
// "Red", "Blue", "Green", "Yellow", "Purple".Collections.shuffle() metodundan
// istifadə edərək siyahını qarışdırın və hər qarışdırmadan sonra nəticəni çap edin.

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        Collections.shuffle(list);

        System.out.println(list);


    }
}
