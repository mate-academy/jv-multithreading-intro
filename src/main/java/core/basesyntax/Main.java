package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread deamonThread = new Thread(new MyRunnable());
        Thread thread = new MyThread();
        thread.start();
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
}
