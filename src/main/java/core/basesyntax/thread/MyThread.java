package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Thread %s is dead!" + e);
        }
        for (int i = 0; i < 21; i++) {
            System.out.print(i + " ");
        }
    }
}
