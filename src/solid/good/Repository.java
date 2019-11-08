package solid.good;

import solid.Order;

public class Repository {
    public void save(Order order) {
        if (isSaved) {

            System.out.printf("Save order");
        }
    }
    private boolean isSaved;
}
