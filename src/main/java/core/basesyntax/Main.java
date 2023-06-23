package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread();
        firstThread.setDaemon(true);
        firstThread.start();
        MyRunnable secondThread = new MyRunnable();
        Thread myRunnableTread = new Thread(secondThread);
        myRunnableTread.start();
    }
}
