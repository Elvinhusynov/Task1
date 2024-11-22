package org.example.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
// 2. İstifadəçidən 10 ədəd rəqəm daxil etməsini istəyin və
// bir ArrayList-də saxlayın.Eyni dəyərdə olan rəqəmləri siyahıdan silən metod yazın.
// Nəticə olaraq unikal elementlərdən ibarət siyahını göstərin.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("10 eded reqem daxil edin: ");

        for (int i = 1; i < 10; i++) {
            list.add(scanner.nextInt());
        }

    }
//            ????????
}



