package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("My thread is created. Thread name is: "
                + Thread.currentThread().getName());
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
