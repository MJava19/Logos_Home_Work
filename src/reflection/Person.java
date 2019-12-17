package reflection;

final class Person {
    private String name = "Міша";
    private String secondName = "Третяк";
    private int age = 25;

    Person(){

    }

    Person(int age, String name) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    private static String first(String name, int age) {
        return "Ім'я та вік: " + name + " " + age;
    }

    private static void second(String secondName, int age) {
        System.out.println("Прізвище та вік: " + secondName + " " + age);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
