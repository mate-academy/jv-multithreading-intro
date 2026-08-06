package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("I am the daemon thread!");
    }
    // write your code here
}
