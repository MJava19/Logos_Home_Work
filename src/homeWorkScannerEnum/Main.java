package homeWorkScannerEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть місяць:");
        String inMounth = in.nextLine();

        for (Mounths m : Mounths.values()) {
            if (inMounth.equalsIgnoreCase(m.name())) {
                System.out.println("Такий місяць існує)");
                System.out.println();
                mounthThisSeason(m);
                mounthHaveSomeDays(m);
                mounthHaveFewerSomeDays(m);
                mounthHaveMoreSomeDays(m);
                nextSeason(m);
                previousSeason(m);
                evenNumberDays();
                oddNumberDays();
                mounthEvenNumberDays(m);
            }
        }
    }

    private static void mounthThisSeason(Mounths m) {
        System.out.println("Місяці які є в цій порі року: ");
        for (Mounths mounths : Mounths.values()) {
            if (m.getSeason().equals(mounths.getSeason())) {
                System.out.println(mounths + " ");
            }
        }
        System.out.println();
    }

    private static void mounthHaveSomeDays(Mounths m) {
        System.out.println("Місяці які мають таку саму кількісь днів: ");
        for (Mounths mounths : Mounths.values()) {
            if (m.getDays() == (mounths.getDays())) {
                System.out.println(mounths + " ");

            }
        }
        System.out.println();
    }

    private static void mounthHaveFewerSomeDays(Mounths m) {
        System.out.println("Місяці які мають меншу кількісь днів: ");
        for (Mounths mounths : Mounths.values()) {
            if (m.getDays() > (mounths.getDays())) {
                System.out.println(mounths + " ");
            }
        }
        System.out.println();
    }

    private static void mounthHaveMoreSomeDays(Mounths m) {
        System.out.println("Місяці які мають більшу кількісь днів: ");
        for (Mounths mounths : Mounths.values()) {
            if (m.getDays() < (mounths.getDays())) {
                System.out.println(mounths + " ");
            }
        }
        System.out.println();
    }

    private static void nextSeason(Mounths m) {
        System.out.println("Наступна пора року: ");
        int ordinal = m.getSeason().ordinal();
        Season[] season = Season.values();
        if (ordinal == season.length - 1) {
            System.out.println(season[0]);
        } else {
            System.out.println(season[ordinal + 1]);
        }
        System.out.println();
    }

    private static void previousSeason(Mounths m) {
        System.out.println("Минула пора року: ");
        int ordinal = m.getSeason().ordinal();
        Season[] season = Season.values();
        if (ordinal == season.length - 4) {
            System.out.println(season[3]);
        } else {
            System.out.println(season[ordinal - 1]);
        }
        System.out.println();
    }

    private static void evenNumberDays() {
        System.out.println("Місяці які мають парну кількість днів: ");
        for (Mounths m : Mounths.values()) {
            if (m.getDays() % 2 == 0) {
                System.out.println(m + " ");
            }
        }
        System.out.println();
    }

    private static void oddNumberDays() {
        System.out.println("Місяці які мають непарну кількість днів: ");
        for (Mounths m : Mounths.values()) {
            if (m.getDays() % 2 != 0) {
                System.out.println(m + " ");
            }
        }
        System.out.println();
    }

    private static void mounthEvenNumberDays(Mounths m) {
        if (m.getDays() % 2 == 0) {
            System.out.println(m + " має парну кількість днів");
        } else System.out.println(m + " має непарну кількість днів");
    }
}

