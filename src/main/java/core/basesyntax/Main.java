package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        MyRunnableThread myRunnable = new MyRunnableThread();
        Thread thread1 = new Thread(myRunnable);
        Thread threadDaemon = new MyThread();
        threadDaemon.setDaemon(true);
        threadDaemon.start();
        thread1.start();
    }
}
