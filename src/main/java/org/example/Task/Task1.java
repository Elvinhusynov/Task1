package org.example.Task;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //    1. İki ArrayList yaradın və içərisinə rəqəmlər əlavə edin.
        //    Hər iki siyahını birləşdirən bir metod yazın.
        //    Nəticə olaraq yeni siyahını ekrana çıxarın.

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                System.out.println(list1.get(i));
                System.out.println(list2.get(j));

            }
        }
    }
}
