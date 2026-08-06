package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread threadImplementation = new Thread(new MyRunnable());
        threadImplementation.setDaemon(true);
        threadImplementation.start();
    }
}
