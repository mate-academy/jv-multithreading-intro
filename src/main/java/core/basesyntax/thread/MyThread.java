package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (currentThread().isAlive()) {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }
}
