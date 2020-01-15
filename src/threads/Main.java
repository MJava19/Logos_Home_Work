package threads;

import java.util.Scanner;

public class Main {
    static int fibonachi;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість чисел фібоначі:");
        fibonachi = scanner.nextInt();
        Fibonachi.fibonachi();

        MyTheard myTheard = new MyTheard();
        RunnebleThead runnebleThead = new RunnebleThead();
        myTheard.run();
        runnebleThead.run();

    }
}
