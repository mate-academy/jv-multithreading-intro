package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am a deamon thread!");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("MyRunnable has been interrupted");
            }
        }

    }
}
