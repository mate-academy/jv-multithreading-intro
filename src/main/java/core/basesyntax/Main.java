package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runThread = new MyRunnable();
        Thread runner = new Thread(runThread);

        Thread thread = new MyThread();
        thread.start();

        runner.setDaemon(true);
        runner.start();
    }
}
