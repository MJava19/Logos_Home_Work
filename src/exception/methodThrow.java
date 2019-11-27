package exception;

import java.util.Scanner;

public class methodThrow {

    public static boolean throwMethod() throws IllegalAccessException, MyException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть два числа через пробіл: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Exeption ' IllegalArgumentException ', try again");
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException("Exeption ' ArithmeticException ', try again");
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException("Exeption ' ArithmeticException ', try again");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("Exeption ' IllegalAccessException ', try again");
        }
        else if (a > 0 && b > 0) {throw new MyException("MyException");
        }
        return false;
    }
}

