package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myRunnableThreat = new Thread(new MyRunnable());
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);

        myRunnableThreat.start();
        myThread.start();
    }
}
