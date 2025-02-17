package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        firstThread();
        secondThread();
    }

    private static void firstThread() {
        Thread firstThread = new Thread(new MyRunnable());
        firstThread.setDaemon(true);
        firstThread.start();
    }

    private static void secondThread() {
        Thread secondThread = new MyThread();
        secondThread.start();
    }
}
