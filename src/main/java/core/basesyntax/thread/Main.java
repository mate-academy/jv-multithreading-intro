package core.basesyntax.thread;

public class Main {
    public static void main(String[] args) {
        // write your code here

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();

    }
}
