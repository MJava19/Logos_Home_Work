package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction  {
    Scanner in = new Scanner(System.in);
    public static String name;

    public Faction(String name) {
        this.name = name;
    }


    public List<Deputy> list = new ArrayList<>();


    public static void addDeputy(List<Deputy> list, Scanner in) {
        System.out.println("Введіть параметри депутата: Вага, Висота, Ім'я, Прізвище, Скільки років, Хабарник(true - так, false - ні):");
        Deputy deputy = new Deputy(in.nextInt(), in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextBoolean());
        list.add(deputy);
    }

    public static void printList(List list) {
        Iterator<Deputy> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void deleteDeputy(List<Deputy> list, Scanner in) {
        System.out.println("Щоб видалити депутата із фракції введіть його порядковий номер:");
        int number = in.nextInt();
        list.remove(number);
    }

    public static void deleteAllDeputyInFaction(List<Deputy> list) {
        list.clear();
        System.out.println("Видалено всіх депутатів з фракції");
    }

    public static void printAllBrides(List list) {
        Iterator<Deputy> iterator = list.iterator();
        System.out.println("Список хабарників: ");
        while (iterator.hasNext()) {
            Deputy deputy = iterator.next();
            if (deputy.isBribe) {
                System.out.println(deputy);
            }
        }
    }

    public static void printBiggestBride(List list) {
        list.sort(new ComparatorForBiggestBride());
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                '}';
    }
}



