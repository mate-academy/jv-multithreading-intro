package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myFirstTread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread mySecondTread = new Thread(myRunnable);
        mySecondTread.setDaemon(true);
        myFirstTread.start();
        mySecondTread.start();
    }
}

