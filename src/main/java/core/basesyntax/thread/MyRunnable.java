package core.basesyntax.thread;

public class MyRunnable extends Thread {
    public MyRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I'm Daemon Thread!");
        }
    }
}
