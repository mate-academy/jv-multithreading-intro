package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread threadClass = new MyThread();
        Thread threadInterface = new Thread(new MyRunnable());
        threadInterface.setDaemon(true);

        threadClass.start();
        threadInterface.start();
    }
}
