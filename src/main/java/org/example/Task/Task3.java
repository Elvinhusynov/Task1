package org.example.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

//  3.ArrayList yaradın və təsadüfi olaraq 20 rəqəm (1-dən 100-ə qədər) əlavə edin.
//  Siyahını artan sırada sıralayın. Ən böyük və ən kiçik rəqəmi tapıb göstərin.

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20 ; i++) {
            list.add(random.nextInt(101) );
            System.out.println("Tesadufi ededler " + list);

            Collections.sort(list);
            System.out.println("Artan sira: " + list);

            int small = list.get(0);
            int big = list.get(list.size() - 1);

            System.out.println("En kicik eded : " + small );
            System.out.println("En boyuk eded : " + big);



        }
    }
}
