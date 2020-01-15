package threads;


public class MyTheard extends Thread {
    @Override
    public void run() {
        try {
            Fibonachi.fibonachi_1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
