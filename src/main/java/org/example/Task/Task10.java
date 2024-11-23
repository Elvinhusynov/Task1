package org.example.Task;

import java.util.Collections;
import java.util.Vector;

public class Task10 {
    public static void main(String[] args) {

//10.	Bir Vector yaradın və təsadüfi rəqəmlər əlavə edin.
// Collections.sort() istifadə edərək elementləri artan sırada sıralayın.

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(8);
        vector.add(4);

        Collections.sort(vector);
        System.out.println(vector);
    }
}
