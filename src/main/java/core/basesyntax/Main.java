package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        thread.start();
    }
}
