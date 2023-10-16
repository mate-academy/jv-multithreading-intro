package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable secondThread = new MyRunnable();
        Thread thread = new Thread(secondThread);
        thread.setDaemon(true);
        thread.start();

        MyThread firstThread = new MyThread();
        firstThread.start();
        // write your code here
    }
}
