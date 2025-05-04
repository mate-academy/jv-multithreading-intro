package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable, "MyRunnable");
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);

        runnableThread.start();
        myThread.start();
    }
}
