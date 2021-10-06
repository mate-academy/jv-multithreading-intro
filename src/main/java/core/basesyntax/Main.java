package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myTread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableTread = new Thread(myRunnable);
        myRunnableTread.setDaemon(true);
        myRunnableTread.start();
        myTread.start();
    }
}
