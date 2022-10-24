package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable first = new MyRunnable();
        MyThread second = new MyThread();
        Thread thread = new Thread(first);
        thread.start();
        second.setDaemon(true);
        second.start();
    }
}
