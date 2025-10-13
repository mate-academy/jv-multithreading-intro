package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new MyThread();

        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);

        t2.setDaemon(true);
        t1.start();
        t2.start();
        // write your code here
    }
}
