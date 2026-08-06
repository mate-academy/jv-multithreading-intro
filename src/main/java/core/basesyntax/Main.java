package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new MyRunnable());
        Thread secondThread = new MyThread();
        secondThread.setDaemon(true);
        firstThread.start();
        secondThread.start();
    }
}
