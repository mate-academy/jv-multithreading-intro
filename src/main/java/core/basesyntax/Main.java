package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        Thread thread1 = new MyThread("Prints number");
        thread1.start();
    }

}
