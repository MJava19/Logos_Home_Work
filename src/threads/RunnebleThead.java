package threads;

public class RunnebleThead implements Runnable {
    @Override
    public void run() {
        try {
            Fibonachi.fibonachi_2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
