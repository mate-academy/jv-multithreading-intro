package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myT = new MyThread();
        Thread threadTwo = new Thread(new MyRunnable());
        threadTwo.setDaemon(true);
        myT.start();
        threadTwo.start();
    }
}
