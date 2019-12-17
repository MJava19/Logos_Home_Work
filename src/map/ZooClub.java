package map;

import java.util.*;

public class ZooClub {

   static Map<Person, List<Animal>> map;

    public ZooClub() {
        map = new HashMap<>();
    }

    public Set<Person> getPerson() {
        return map.keySet();
    }

    public List<Animal> getAnimalsFromPerson(Person person) {
        return map.get(person);
    }

    public void animalToPerson(Animal animal, Person person) {
        map.get(person).add(animal);
    }

    public void addPerson(Person person) {
        map.put(person, new LinkedList<>());
    }

    public void removeAnimalInPerson(Animal animal, Person person) {
        map.get(person).remove(animal);
    }

    public void removePerson(Person person) {
        map.remove(person);
    }

    public void removeAnimalOfAllPerson(Animal animal) {
        map.remove(animal);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "map=" + map +
                '}';
    }
}

