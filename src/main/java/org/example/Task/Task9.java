package org.example.Task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

//Bir LinkedList yaradın və istifadəçidən 10 rəqəm daxil etməsini istəyin.
// Siyahıdakı təkrarlanan elementləri silərək yalnız unikal elementləri
// saxlayan metod yazın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("10 eded daxil edin: ");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + "ci eded :  ");
            set.add(scanner.nextInt());

        }
        System.out.println(set);
    }


}
