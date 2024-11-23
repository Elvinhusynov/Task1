package org.example.Task;

import java.util.Vector;

public class Task11 {
    public static void main(String[] args) {

//11.Bir Vector yaradın və ona bir neçə rəqəm əlavə edin.
//trimToSize() metodu ilə tutumunu cari ölçüyə endirin.
//Tutumun dəyişib-dəyişmədiyini yoxlayın.

        Vector<Integer> vector = new Vector<>();
        vector.add(4);
        vector.add(7);
        vector.add(8);
        System.out.println("Vector tutumu: " + vector.capacity());
        System.out.println("Vector ölçüsü: " + vector.size());
         vector.trimToSize();
         System.out.println("Vector trimToSize() metodundan sonra tutumu: " + vector.capacity());
         System.out.println("Vector trimToSize() metodundan sonra ölçüsü: " + vector.size());


    }
}
