package core.basesyntax.thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for ( ; ; ) {
            System.out.println("I am the daemon thread!");
        }
    }
}
