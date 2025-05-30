package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here

    @Override
    public void run() {
        while (true) {
            System.out.println("I am a daemon thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
