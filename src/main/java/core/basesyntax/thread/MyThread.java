package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000L); // Sleep to make the output more readable
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
