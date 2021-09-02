package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        firstThread.setDaemon(true);
        firstThread.start();
        Thread secondThread = new Thread(new MyRunnable());
        secondThread.start();
    }
}
