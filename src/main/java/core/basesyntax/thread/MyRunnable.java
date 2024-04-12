package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I am the deamon thread!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
