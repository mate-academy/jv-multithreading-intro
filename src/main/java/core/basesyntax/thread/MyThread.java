package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm a daemon thread! A-ha-ha!!!");
        }
    }
}
