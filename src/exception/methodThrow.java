package exception;



public class methodThrow {

    public static boolean throwMethod(int a, int b) throws IllegalAccessException, MyException {
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

