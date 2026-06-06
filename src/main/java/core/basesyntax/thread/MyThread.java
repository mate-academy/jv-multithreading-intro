package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
