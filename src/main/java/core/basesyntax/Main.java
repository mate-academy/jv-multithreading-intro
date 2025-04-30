package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread taskThread = new MyThread();
        taskThread.start();
        taskThread.setDaemon(true);
        MyRunnable taskRunnableThread = new MyRunnable();
        Thread taskRunnable = new Thread(taskRunnableThread);
        taskRunnable.start();
    }
}
