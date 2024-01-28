package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Thread threadFromRunnable = new Thread(new MyRunnable());
        threadFromRunnable.setDaemon(true);
        thread.start();
        threadFromRunnable.start();
    }
}
