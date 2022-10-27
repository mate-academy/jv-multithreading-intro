package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
        //System.out.println("MyThread " + Thread.currentThread().getName());
    }
}
