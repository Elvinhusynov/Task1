package org.example.Task;

import javax.swing.*;
import java.util.LinkedList;

public class Task8 {
    public static void main(String[] args) {

//8.Təsadüfi ədədlərlə doldurulmuş bir LinkedList yaradın.
// Siyahının uzunluğunu hesablayın və ortadakı elementi tapın.Uzunluq təkdirsə,
// tam ortadakı elementi göstərin.Uzunluq cütdürsə, iki orta elementi göstərin

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            int length = list.size();
            if (length % 2 == 1){
                int tamOrta = list.get(length / 2);
                System.out.println("Ortadaki elemet " + tamOrta);
            }else {
                int orta1 = list.get(length/2) - 1 ;
                int orta2 = list.get(length/2);
                System.out.println("Iki orta element: " + orta1 + orta2);
            }

        }


    }
}
