package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

    Thread myThread = new MyThread();
    Thread runnable = new Thread(new MyRunnable());

    runnable.setDaemon(true);

    myThread.start();
    runnable.start();

    }
}
