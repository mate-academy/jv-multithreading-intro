package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.setDaemon(true);
        thread2.start();
    }
}
