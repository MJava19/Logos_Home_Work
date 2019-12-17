package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodsOther {
    private static Scanner in = new Scanner(System.in);
    public static void Menu() {
        System.out.println();
        System.out.println();
        System.out.println("1. Додати учасника клубу\n" +
                "2. Додати тваринку до учасника клубу\n" +
                "3. Видалити тваринку з учасника клубу\n" +
                "4. Видалити учасника з клубу\n" +
                "5. Вивести на екран зооклуб\n" +
                "6. Вийти з програми");
        System.out.print("Введіть номер дії яку хочете здійснити: ");
    }

    public static Person inPerson(){
        System.out.print("Введіть вік людини: ");
        int age = in.nextInt();
        System.out.print("Введіть ім'я людини: ");
        String name = in.next();
        return new Person(age, name);
    }

    public static Animal inAnimal(){
        System.out.println("Введіть тип тваринки: ");
        int i = 0;
        for (Tipe t : Tipe.values()){
            System.out.println((i++)+" "+t);
        }
        Tipe tipe =  Tipe.values()[in.nextInt()];
        System.out.print("Введіть назву для тваринки: ");
        String name = in.next();
        return new Animal(name, tipe);
    }

    public static Person printPerson(ZooClub zooClub) {
        List<Person> persons = new ArrayList<>(zooClub.getPerson());

        System.out.println("Список клієнтів клубу: ");
        int i = 0;
        for (Person p : persons) {
            System.out.println((i++) + ". " + p.getName());
        }
        System.out.print("Виберіть людину якій даєте тваринку: ");
        int index = in.nextInt();

        return persons.get(index);
    }

    public static Animal printAnimal(ZooClub zooClub, Person person) {
        List<Animal> animals = zooClub.getAnimalsFromPerson(person);

        System.out.println("Список тваринок у: " + person.getName());
        int i = 0;
        for (Animal a : animals) {
            System.out.println((i++) + ". " + a.getName());
        }

        System.out.print("Виберіть тваринку: ");
        int index = in.nextInt();

        return animals.get(index);
    }
}
