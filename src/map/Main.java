package map;

import java.util.Scanner;

public class Main {
   private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Animal animal = null;
        Person person = null;

        while (true){
            MethodsOther.Menu();
            int key = in.nextInt();
            switch (key){
                case 1:{
                    System.out.println("Додати учасника клубу: ");
                   person = MethodsOther.inPerson();
                   zooClub.addPerson(person);
                   break;
                }
                case 2: {
                    System.out.println("Додати тваринку до учасника клубу: ");
                    animal = MethodsOther.inAnimal();
                    person = MethodsOther.printPerson(zooClub);
                    zooClub.animalToPerson(animal, person);
                    break;
                }
                case 3: {
                    System.out.println("Видалити тваринку з учасника клубу: ");
                    person = MethodsOther.printPerson(zooClub);
                    animal = MethodsOther.printAnimal(zooClub,person);
                    zooClub.removeAnimalInPerson(animal, person);
                    break;
                }
                case 4: {
                    System.out.println("Видалити учасника з клубу: ");
                    person = MethodsOther.printPerson(zooClub);
                    zooClub.removePerson(person);
                    break;
                }
                case 5: {
                    System.out.println("Весь Зооклуб: ");
                    System.out.println(zooClub);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default:{
                    System.out.println("Ви ввели не дійсне значення!\n Спробуйте ще раз)");
                }
            }
        }
    }
}
