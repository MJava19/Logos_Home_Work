package iterator;

import java.util.*;

public class VR {
    public static void main(String[] args) {
        List<Deputy> list = new ArrayList();
        List<Faction> factions = new ArrayList<>();
        Scanner in = new Scanner(System.in);
//        Faction.addDeputy(list, in);
//        Faction.printList(list);
//        Faction.deleteDeputy(list,in);
//        Faction.printAllBrides(list);
//        Faction.deleteAllDeputyInFaction(list);
//        Faction.printBiggestBride(list);
//        Deputy.addBribe(Deputy.isBribe, in, Deputy.sizeBribe);


        System.out.println("\n" +
                "Введіть 1 щоб додати фракцію\n" +
                "Введіть 2 щоб видалити конкретну фракцію\n" +
                "Введіть 3 щоб вивести усі фракції\n" +
                "Введіть 5 щоб вивести депутатів фракції\n" +
                "Введіть 6 щоб додати депутата в фракцію\n" +
                "Введіть 7 щоб видалити депутата з фракції\n" +
                "Введіть 8 щоб вивести список хабарників у фракції\n" +
                "Введіть 9 щоб вивести найбільшого хабарника у фракції\n" +
                "Введіть 0 щоб запропонувати депутату хабар\n" +
                "Введіть + щоб вивести всіх депутатів Верховної ради");

        switch (in.next()){
            case "1":{
                VR.addFraction(factions, in);
                break;
            }case "2":{
                VR.deleteFraction(factions, in);
                break;
            }case "3":{
                VR.printFraction(factions);
                break;
            }case "5":{
                VR.printFraction(factions);
                break;
            }case "6":{

                break;
            }case "7":{

                break;
            }case "8":{

                break;
            }case "9":{

                break;
            }case "0": {

                break;
            }case "+":{

                break;
            }case "<":{

                break;
            }default:{
                System.out.println("Спробуйте знову");
            }
        }
    }

    public static void addFraction(List<Faction> factions, Scanner in) {
        System.out.println("Введіть назву фракції");
        Faction faction = new Faction(in.next());
    }

    public static void printFraction(List<Faction> factions) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void deleteFraction(List<Faction> factions, Scanner in) {
        System.out.println("Введіть порядковий номер фракції щоб видалити її:");
        VR.printFraction(factions);
        factions.remove(in.nextInt());
    }

    public static void printChoiseFraction(List<Faction> factions, Scanner in) {
        System.out.println("Введіть назву фракції");
        if (in.next().equals(Faction.name)) {
            System.out.println(factions);
        } else {
            System.out.println("Фракцію не знайдено!");
        }
    }
}
