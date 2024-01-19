package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread("my thread 1");
        thread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable, "myRunnable 1");
        runnableThread.setDaemon(true);
        runnableThread.start();
    }
}
