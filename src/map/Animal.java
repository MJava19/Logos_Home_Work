package map;

public class Animal {
    private String  name;
    private Tipe tipe;

    public Animal(String name, Tipe tipe) {
        this.name = name;
        this.tipe = tipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tipe getTipe() {
        return tipe;
    }

    public void setTipe(Tipe tipe) {
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", tipe=" + tipe +
                '}';
    }
}
