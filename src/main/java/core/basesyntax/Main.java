package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new MyThread();
        thread.setDaemon(true); // We make daemon thread here.
        thread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread anotherThread = new Thread(myRunnable);
        anotherThread.start();
    }
}
