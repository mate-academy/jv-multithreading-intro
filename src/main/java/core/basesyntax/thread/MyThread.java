package core.basesyntax.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 21; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException("The thread was interrupted");
            }
            System.out.println(i);
        }
    }
}
