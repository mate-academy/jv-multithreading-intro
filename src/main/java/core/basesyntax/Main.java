package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new Thread(new MyRunnable());
        Thread myThread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        myThread.start();
    }
}
