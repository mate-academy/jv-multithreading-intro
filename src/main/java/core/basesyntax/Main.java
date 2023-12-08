package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread myRunnagleThread = new Thread(new MyRunnable());
        myRunnagleThread.setDaemon(true);
        myThread.start();
        myRunnagleThread.start();
    }
}
