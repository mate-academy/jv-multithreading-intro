package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread("Demon");
        myThread.setDaemon(true);

        myThread.start();
        myRunnable.run();
    }
}
