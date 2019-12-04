package arrayListAndLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> cars = new LinkedList<>();
        RandomFullArray(cars);
        SortIncreasing(cars);
        SortDecreasing(cars);
        Main();
    }

    private static void RandomFullArray(List<Integer> cars){
        Random random = new Random();
        int size = random.nextInt(10) + 5;
        for (int i = 0; i < size; i++) {
           ((LinkedList<Integer>) cars).addFirst(random.nextInt(100));
        }
        System.out.println(cars);
    }

    private static void SortIncreasing(List<Integer> cars){
        System.out.println("Відсортований масив в порядку зростання: ");
        Collections.sort(cars);
        System.out.println(cars);
    }

    private static void SortDecreasing(List<Integer> cars){
        System.out.println("Відсортований масив в порядку спадання: ");
        Collections.reverse(cars);
        System.out.println(cars);
    }

    private static void Main(){
        Random random = new Random();
        List<String> cars = new LinkedList<>();

        Car car = new Car(random.nextInt(1000),random.nextInt(2020));
        car.setHorsepower(549);
        Engine engine = new Engine(random.nextInt(12));
        int material = random.nextInt(2);
        Helm helm = new Helm(random.nextInt(100),Material.values()[material]);

        for (int h = 0; h < 1 ; h++) {
            for (int k = 0; k < 1; k++) {
                ((LinkedList<String>) cars).addFirst(car.toString() + " " + engine.toString() + " " + helm.toString());
                System.out.println("\n" + cars);
            }
        }
    }
}
