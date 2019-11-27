package string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть речення: ");
        String t = input.nextLine();
        String t1 = t.replace('а','-');
        String t2 = t1.replace('о','-');
        String t3 = t2.replace('у','-');
        String t4 = t3.replace('е','-');
        String t5 = t4.replace('и','-');
        String t6 = t5.replace('і','-');
        System.out.println("Заміна голосних літар на '-': "+t6);

        int counttext = 0;
        for (int i = 0; i < t.length(); i++) {
            char textChar = t.charAt(i);
            if (textChar == '.' || textChar == '!' || textChar == '?') {
                counttext++;
            }
        }
        System.out.println("Кількість речень в тексті: "+counttext);

        String[] stringArray;
        stringArray = t.split(" ");
        String word = "";
        String maxWord = "";
        int count = 1;
        int maxCount = 0;

        Arrays.sort(stringArray);

        for (String p : stringArray) {
            if (p.equalsIgnoreCase(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = p;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }
        System.out.println("Слово яке найчастіше використовується в тексті: " + maxWord.toLowerCase() +
                "\nСлово використовувалось: " + maxCount + " рази(-ів)");
    }
}
