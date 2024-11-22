package org.example.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

//Bir LinkedList yaradın və bir neçə rəqəm əlavə edin.
// Sonuncu elementi birinci elementə qoşaraq (loop yaradaraq) siyahını dövrə salın.
// Düzgün işlədiyini yoxlamaq üçün dövr qurub hər elementi ekrana çıxarın
// (dövr pozulana qədər).

        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(7);
        list.add(5);

        for (int i = 0; i <list.size() ; i++) {
            int number = i;
            number = number-1;

        }






    }
}
