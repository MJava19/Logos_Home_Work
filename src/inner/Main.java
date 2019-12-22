package inner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection(new Integer[]{1, 2, 3, 4, 4, 6, 7, 8, 9, 11, 11, 12, 8});

        System.out.println(Arrays.toString(collection.getNumbers()));
        System.out.println("InnerFirst: ");
        while (collection.first.hasNext()){
            System.out.println(collection.first.next());
        }

        collection.setNumbers(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 48, 51});

        System.out.println("InnerSecond: ");
        while (collection.second.hasNext()){
            System.out.println(collection.second.next());
        }

        System.out.println("AnonimClass: ");
        Iterator anonimClass = new Iterator() {
            private int number = collection.getNumbers().length + 2;
            @Override
            public boolean hasNext() {
                return number > 1;
            }

            @Override
            public Number next() {
                number -=3;
                return collection.getNumbers()[number];
            }
        };
        while (anonimClass.hasNext()){
            Number x = (Number) anonimClass.next();
            if (x.intValue() % 2 != 0){
                System.out.println(x);
            }
        }

        System.out.println("LocalClass: ");
        class localClass implements Iterator{
            int number = -5;
            @Override
            public boolean hasNext() {
                return collection.getNumbers().length > number + 5;
            }

            @Override
            public Number next() {
                number += 5;
                return collection.getNumbers()[number];
            }
        }

        localClass localClass1 = new  localClass();
        while (localClass1.hasNext()){
            Number x = localClass1.next();
            if (x.intValue() % 2 == 0){
                System.out.println(x.intValue() - 100);
            }
        }
// Далі не працює, не розумію чому(
        System.out.println("StaticClass: ");
        staticClass staticClass1 = new staticClass();
        collection.setNumbers(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 48, 51});
        while (staticClass1.hasNext()){
            Number x = staticClass1.next();
            if (x.intValue() % 2 == 0){
                System.out.println(x.intValue() + 1);
            }
        }
    }
    static class staticClass implements Iterator{
        Collection collection = new Collection(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 48, 51});
        int number = -2;
        @Override
        public boolean hasNext() {
            return (number + 2) > collection.getNumbers().length;
        }

        @Override
        public Number next() {
            number += 2;
            return collection.getNumbers()[number];
        }

    }
}


