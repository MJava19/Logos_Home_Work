package reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Person person = new Person();
        Class person1 = person.getClass();

        System.out.println("Конструктори та їх параметри: ");
        Constructor[] constructors = person1.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameter = constructor.getParameters();
            for (Parameter parameter1 : parameter) {
                System.out.println(parameter1.getName());
                System.out.println(parameter1.getType().getName());
            }
        }

        System.out.println();
        System.out.println("Методи та їх параметри: ");
        Method[] methods = person1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameter = method.getParameters();
            for (Parameter parametrs : parameter) {
                System.out.println(parametrs.getName());
                System.out.println(parametrs.getType().getName());
            }
        }

        System.out.println();
        System.out.println("Поля їх значення та модифікатори");
        Field[] fields = person1.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }

        // План МАКСИМУМ

        System.out.println();
        System.out.println("Достаєм значення поля без getter: ");
        Field field = person1.getDeclaredField("name");
        field.setAccessible(true);
        String name = (String) field.get(person);
        System.out.println(name);

        System.out.println();
        System.out.println("Міняєм значення поля без setter: ");
        Field field1 = person1.getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(person, "Тарас");
        String name1 = (String) field1.get(person);
        System.out.println(name1);

        System.out.println();
        Method method = person.getClass().getDeclaredMethod("first", String.class, int.class);
        method.setAccessible(true);
        System.out.println( method.invoke(person,  "Roma", 35));

        System.out.println();
        Method method1 = person.getClass().getDeclaredMethod("second", String.class, int.class);
        method1.setAccessible(true);
        System.out.println(method1.invoke(person,"Popov", 35));
    }
}
