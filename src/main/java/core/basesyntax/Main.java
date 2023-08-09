package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread customThread = new MyThread();
        Thread customDeamonThread = new Thread(new MyRunnable());
        customDeamonThread.setDaemon(true);

        customDeamonThread.start();
        customThread.start();
    }
}
