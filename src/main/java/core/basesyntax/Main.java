package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread threadOne = new MyThread();
        threadOne.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread threadTwo = new Thread(myRunnable);
        threadTwo.setDaemon(true);
        threadTwo.start();
    }
}
