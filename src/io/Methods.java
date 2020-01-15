package io;

import java.io.*;

public class Methods {

    public static void serialize(Object o) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Java\\Desktop\\CanSecurity\\serializefile.out");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o);
    }

    public static Object deserialize() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Java\\Desktop\\CanSecurity\\serializefile.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();
    }
}
