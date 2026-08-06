package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread classThread = new MyThread();
        classThread.start();
        Runnable interfaceRunnable = new MyRunnable();
        Thread interfaceThread = new Thread(interfaceRunnable);
        interfaceThread.setDaemon(true);
        interfaceThread.start();

    }
}
