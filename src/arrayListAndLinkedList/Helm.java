package arrayListAndLinkedList;


public class Helm {
    int wheelDiameter;
    Material material;

    public Helm(int wheelDiameter, Material material) {
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
