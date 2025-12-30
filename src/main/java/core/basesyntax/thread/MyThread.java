package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here

    public MyThread() {
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I'm a daemon thread!");
        }
    }
}
