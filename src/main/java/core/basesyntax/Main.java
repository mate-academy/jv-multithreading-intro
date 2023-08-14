package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadOne = new MyThread();
        Thread threadTwo = new Thread(new MyRunnable());

        threadTwo.setDaemon(true);
        threadOne.start();
        threadTwo.start();
    }
}
