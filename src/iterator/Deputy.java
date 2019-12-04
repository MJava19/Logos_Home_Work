package iterator;

import java.util.Scanner;

public class Deputy extends Men {
    Scanner in = new Scanner(System.in);
    public  static String name;
    String secondName;
    int age;
    public static boolean isBribe;
    public static int sizeBribe;



    public Deputy(int weight, int height, String name, String secondName, int age, boolean isBribe) {
        super(weight, height);
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.isBribe = isBribe;
    }

    public Deputy(int weight, int height) {
        super(weight, height);
    }



    public static void addBribe(boolean isBribe, Scanner in, int sizeBribe){
        System.out.println("Введіть суму хабаря");
        int bribe = in.nextInt();
        if (!isBribe){
            System.out.println("Цей депутат не бере хабарів!");
        }
        else if (bribe > 5000){
            System.out.println("Миліція увязнить депутата");
        }
        else {
            bribe = sizeBribe;
        }
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", isBribe=" + isBribe +
                ", sizeBribe=" + sizeBribe +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
