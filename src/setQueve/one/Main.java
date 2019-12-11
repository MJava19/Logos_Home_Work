package setQueve.one;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        Set<Person> setPerson = new HashSet<>(list);

        Person person0 = new Person("Артур", "Петросян", 3);
        Person person1 = new Person("Данило", "Галицький", 4);
        Person person2 = new Person("Галілео", "Галілей", 1);
        Person person3 = new Person("Тарас", "Смуток", 2);
        Person person4 = new Person("Ігор", "Сонячний", 5);

        setPerson.add(person0);
        setPerson.add(person1);
        setPerson.add(person2);
        setPerson.add(person3);
        setPerson.add(person4);
        System.out.println("Не сортований список:");
        for (Object e : setPerson) {
            System.out.println(e);
        }
        System.out.println();

        list.addAll(setPerson);
        Collections.sort(list);

        System.out.println("Відсортований список:");
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
