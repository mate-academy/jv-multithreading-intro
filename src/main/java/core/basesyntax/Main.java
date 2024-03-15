package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnable");
        thread.setDaemon(true);
        thread.start();

        Thread myThread = new MyThread("MyThread");
        myThread.start();
    }
}
