package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
