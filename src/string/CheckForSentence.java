package string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть речення: ");
        String sentence = input.nextLine();
        String[] stringArray;
        stringArray = sentence.split(" ");
        System.out.println("Кількість слів у реченні: "+stringArray.length);

        String word = "";
        String maxWord = "";
        int count = 1;
        int maxCount = 0;

        Arrays.sort(stringArray);

        for (String s : stringArray) {
            if (s.equalsIgnoreCase(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }
        System.out.println("Слово яке найчастіше використовується в реченні: " + maxWord.toLowerCase() +
                "\nСлово використовувалось: " + maxCount + " рази(-ів)");
    }
}
