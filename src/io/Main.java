package io;

import java.io.IOException;

public class Main extends Methods{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee misha = new Employee("Misha", 1, 35000);
        System.out.println("Before serialize: " + misha);
        Methods.serialize(misha);

        Employee deserializeMisha = (Employee) Methods.deserialize();
        System.out.println("After deserialize: " + deserializeMisha);

    }
}
