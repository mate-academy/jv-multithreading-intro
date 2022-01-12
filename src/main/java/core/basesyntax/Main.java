package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread runnableThread = new Thread(myRunnableThread);
        runnableThread.setDaemon(true);
        runnableThread.start();
    }
}
