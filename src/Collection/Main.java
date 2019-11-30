package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] in = new Integer[15];
        RandomFullArray(in);
        SortIncreasing(in);
        SortDecreasing(in);

        // План МАКСИМУМ
        Main();

    }

    private static void RandomFullArray(Integer[] in){
        Random random = new Random();
        for (int i = 0; i < in.length; i++) {
           in[i] = random.nextInt(100);
            System.out.println(in[i]+"  ");
        }
    }

    private static void SortIncreasing(Integer[] in){
        Arrays.sort(in);
        System.out.println("Відсортований масив в порядку зростання: ");
        for (Integer i : in) {
            System.out.println(i + " ");
        }
    }

    private static void SortDecreasing(Integer[] in){
        Arrays.sort(in, Comparator.reverseOrder());
        System.out.println("Відсортований масив в порядку спадання: ");
        for (Integer i : in) {
            System.out.println(i + " ");
        }
    }

    private static void Main(){
        Random random = new Random();
        int i = random.nextInt(10);
        int j = random.nextInt(10);
        String[][] array = new String[i][j];

        Car car = new Car(random.nextInt(1000),random.nextInt(2020));
        car.setHorsepower(549);
        Engine engine = new Engine(random.nextInt(12));
        Helm helm = new Helm(random.nextInt(100),"Алькантара");

        for (int h = 0; h < 1 ; h++) {
            for (int k = 0; k < 1; k++) {
                array[h][k] = car.toString() + " " + engine.toString() + " " + helm.toString();
                System.out.println(array[h][k] + " ");
            }
        }
    }
}
