package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        firstThread.start();
        Thread deamonThread = new Thread(new MyRunnable());
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
}
