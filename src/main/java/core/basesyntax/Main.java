package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(() -> {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        });
        Thread thread2 = new Thread(new MyRunnable());
        thread1.setDaemon(true);
        thread2.start();
        thread1.start();
    }
}
