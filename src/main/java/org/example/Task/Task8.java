package org.example.Task;

import java.util.HashSet;

public class Task8 {
    public static void main(String[] args) {
//8.Müəllimlərin isimlərini bir Set-ə əlavə edin.
// Set-də olan bütün adları çap edin (təkrarlanma olmayacaq)

        HashSet<String>set = new HashSet<>();
        set.add("Dunay");
        set.add("Shebnem");
        set.add("Rufet");
        set.add("Dunay");
        set.add("Shebnem");
        set.add("Rufet");

        System.out.println("Set de olan muellimlerin adlari - " + set);


    }
}
