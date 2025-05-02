package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread myThreadFromRunnable = new Thread(myRunnable);
        
        myThread.setDaemon(true);
        myThreadFromRunnable.start();
        myThread.start();
    }
}
