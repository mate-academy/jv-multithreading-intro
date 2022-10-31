package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        Runnable secondThreat = new MyRunnable();
        Thread secondThread = new Thread(secondThreat);
        firstThread.start();
        secondThread.start();
    }
}
