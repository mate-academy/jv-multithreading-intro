package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadFromClass = new MyThread();
        Thread threadFromInterface = new Thread(new MyRunnable());
        threadFromInterface.setDaemon(true);
        threadFromClass.start();
        threadFromInterface.start();
    }
}
