package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableTread = new Thread(myRunnable, "my-runnable");

        Thread myThread = new MyThread("my-thread");
        myThread.setDaemon(true);

        myThread.start();
        myRunnableTread.start();
    }
}
