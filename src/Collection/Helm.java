package Collection;


public class Helm {
    int wheelDiameter;
    String material;

    public Helm(int wheelDiameter, String material) {
        this.wheelDiameter = wheelDiameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "wheelDiameter=" + wheelDiameter +
                ", material='" + material + '\'' +
                '}';
    }
}
