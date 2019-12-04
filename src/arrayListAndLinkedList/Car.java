package arrayListAndLinkedList;

public class Car {
    int horsepower;
    int graduationYear;


    public Car(int horsepower, int graduationYear) {
        this.horsepower = horsepower;
        this.graduationYear = graduationYear;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", graduationYear=" + graduationYear +
                '}';
    }
}
