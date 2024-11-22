package org.example.Task;

import java.util.LinkedList;

public class Task8 {
    public static void main(String[] args) {

//8.	Təsadüfi ədədlərlə doldurulmuş bir LinkedList yaradın.
// Siyahının uzunluğunu hesablayın və ortadakı elementi tapın.Uzunluq təkdirsə,
// tam ortadakı elementi göstərin.Uzunluq cütdürsə, iki orta elementi göstərin

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Listin uzunlugu : " + list.get(i));
            if (i % 2 == 1);



        }


    }
}
