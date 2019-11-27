package exception;


import java.util.Scanner;

import static exception.methodThrow.throwMethod;

public class Main  {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Method myMethod = new Method();
        System.out.println("Виберіть дію яку хочете виконати (1-4):");
        System.out.println("1 - додати;\n2 - відняти;\n3 - помножити;\n4 - поділити;");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        switch (s){
            case 1:{
                int a = in.nextInt();
                int b = in.nextInt();
                if (throwMethod() == false){
                 System.out.println("Результат = " + myMethod.add(a, b));}
                 break;
            }
            case 2:{
                int a = in.nextInt();
                int b = in.nextInt();
                if (throwMethod() == false){
                System.out.println("Результат = " + myMethod.divide(a, b));}
                break;
            }
            case 3:{
                int a = in.nextInt();
                int b = in.nextInt();
                if (throwMethod() == false){
                System.out.println("Результат = " + myMethod.multiply(a, b));}
                break;
            }
            case 4:{
                int a = in.nextInt();
                int b = in.nextInt();
                if (throwMethod() == false)
                {System.out.println("Результат = " + myMethod.subtract(a, b));}
                break;
            }
        }
    }
}
