package solid.good;

import solid.Order;

public class GoodProcess {



    public Order  order(){
        Order order = new Order();
        System.out.printf("Receive order");
        return order;
    }
}
