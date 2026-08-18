package core.basesyntax.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
