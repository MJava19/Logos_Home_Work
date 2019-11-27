package string;

import java.util.Scanner;

public class CheckForWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть слово з 5 букв: ");
        String wordIn = input.nextLine();
        if (wordIn.length() != 5){
            throw new IllegalArgumentException("Помилка!!! Введіть слово з 5 букв!");
        }
        StringBuffer wordNotCheck = new StringBuffer(wordIn);
        String wordCheck = new String(wordNotCheck.reverse());
        if (wordIn.equalsIgnoreCase(wordCheck)){
            System.out.println("Слово '"+ wordCheck.toLowerCase() +"' є поліндромом");
        }
        else System.out.println("Слово '"+ wordIn.toLowerCase() +"' не є поліндромом");
    }
}
