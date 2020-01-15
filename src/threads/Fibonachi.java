package threads;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;
import static threads.Main.fibonachi;

public class Fibonachi {

    static List<Integer> arrayList = new ArrayList<>();

    public static void fibonachi() {
        int number_1 = 0;
        int number_2 = 1;
        int number_3;

        arrayList.add(number_1);
        arrayList.add(number_2);

        for (int i = 2; i < fibonachi; i++) {
            number_3 = number_1 + number_2;
            number_1 = number_2;
            number_2 = number_3;
            arrayList.add(number_3);
        }
    }

    public static void fibonachi_1() throws InterruptedException {
        for (Integer i : arrayList) {
            Thread.sleep(1000);
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fibonachi_2() throws InterruptedException {
        Collections.reverse(arrayList);
        for (Integer i : arrayList) {
            Thread.sleep(1000);
            System.out.print(i + " ");
        }
    }
}
