package inner;

public class Collection {
    private Number[] numbers;
    First first;
    Second second;

    public Collection(Number[] numbers) {
        this.numbers = numbers;
        this.first = new First();
        this.second = new Second();
    }

    public void setNumbers(Number[] numbers) {
        this.numbers = numbers;
    }

    public Number[] getNumbers() {
        return numbers;
    }

    class First implements Iterator {
        private int elem = -1;

        @Override
        public boolean hasNext() {
            return (elem + 1) < numbers.length;
        }

        @Override
        public Number next() {
            elem ++;
            if(elem % 2 == 0){
                numbers[elem] = 0;
            }
            return numbers[elem];
        }
    }

    class Second implements Iterator {
        private int element = numbers.length + 1;
        @Override
        public boolean hasNext() {
            return element > 1;
        }

        @Override
        public Number next() {
            element -= 2;
            return numbers[element];
        }
    }
}
