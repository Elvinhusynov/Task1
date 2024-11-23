package org.example.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.println("10 eded reqem daxil edin: ");

        for (int i = 1; i < 10; i++) {
            int number = scanner.nextInt();
            set.add(number);
        }
        System.out.println(set);
    }

}



