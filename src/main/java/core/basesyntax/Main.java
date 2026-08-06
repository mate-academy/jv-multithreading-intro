package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        MyThread firstThread = new MyThread();
        Thread secondThread = new Thread(myRunnable);

        firstThread.start();
        secondThread.start();
    }
}
