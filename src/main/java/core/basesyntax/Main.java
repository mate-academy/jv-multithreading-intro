package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread numberPrinter = new MyThread();

        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);

        numberPrinter.start();
        daemonThread.start();
    }
}
