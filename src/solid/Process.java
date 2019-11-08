package solid;

public class Process {
    public static void  order(Order order){
        System.out.printf("Receive order");
    }

    public void save(Order order){
        System.out.printf("Save order");
    }

    public void confirmationMail(String email){
        System.out.printf("Confirmation send");
    }
}
