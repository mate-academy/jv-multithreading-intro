package core.basesyntax;

import core.basesyntax.thread.MyRunnable;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread();
        myThread.setDaemon(true);
        myThread.setPriority(10);
        myThread.start();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
    }
}
