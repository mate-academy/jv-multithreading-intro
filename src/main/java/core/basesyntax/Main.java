package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread myRunnable = new Thread(new MyRunnable());
        Thread myTread = new MyThread();
        myTread.setDaemon(true);

        myRunnable.start();
        myTread.start();
    }
}
