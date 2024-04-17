package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        var myThread = new MyThread();
        var myRunnable = new Thread(new MyRunnable());
        myRunnable.setDaemon(true);

        myThread.start();
        myRunnable.start();
    }
}
