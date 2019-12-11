package setQueve.one;


public class Person implements Comparable<Person> {
    String name;
    String secondName;
    int idPerson;

    public Person(String name, String secondName, int idPerson) {
        this.name = name;
        this.secondName = secondName;
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", idPerson=" + idPerson +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        Integer k = Integer.compare(idPerson, o.getIdPerson());
        return k;
    }
}
