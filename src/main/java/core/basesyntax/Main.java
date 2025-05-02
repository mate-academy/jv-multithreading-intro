package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setDaemon(true);
        thread.start();
        thread2.start();
    }
}
