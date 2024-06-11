package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThead = new MyThread();
        myThead.setDaemon(true);
        myThead.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
    }
}
