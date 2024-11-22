package org.example.Task;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

//  Bir ArrayList yaradın və 7 rəqəm əlavə edin.
//  İstifadəçidən bir rəqəm daxil etməsini istəyin.
//  Bu rəqəm siyahıda varsa, "Tapıldı" mesajını göstərin. Yoxdursa, "Tapılmadı" yazın.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded daxil edin : ");
        int number = scanner.nextInt();

        if (list.contains(number)) {
            System.out.println("tapildi");

        } else {
            System.out.println("Tapilmadi");
        }


    }


}


