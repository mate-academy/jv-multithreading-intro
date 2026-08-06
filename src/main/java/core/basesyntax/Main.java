package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread firstThread = new Thread(runnable);
        Thread secondThread = new MyThread();

        firstThread.start();

        secondThread.setDaemon(true);
        secondThread.start();

        System.out.println("Finish");
    }
}
