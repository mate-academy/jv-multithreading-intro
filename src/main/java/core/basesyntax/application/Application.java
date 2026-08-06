package core.basesyntax.application;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Application {

    public void start() {
        Thread myThread = new MyThread();

        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);

        myThread.start();
        daemonThread.start();

        waitingForThread(myThread);
        System.out.println("The application finished!");
    }

    private void waitingForThread(Thread thread) {

        try {
            thread.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
