package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new MyThread();
        thread.setDaemon(true);
        Thread threadRun = new Thread(new MyRunnable());
        thread.start();
        threadRun.start();
    }
}
