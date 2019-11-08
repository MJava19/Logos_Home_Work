package solid.good;

import solid.Order;

public class Main {
    public static void main(String[] args) {

        Repository repository = new Repository();
        Mail mail = new Mail();
        GoodProcess process = new GoodProcess();
        Order order = process.order();
        repository.save(order);
        mail.confirmationMail(order.email);
    }
}
