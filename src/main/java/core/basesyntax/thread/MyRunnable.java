package core.basesyntax.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {
    private volatile boolean running = true;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        scheduler.scheduleAtFixedRate(() -> {
            if (!running) {
                System.err.println("Exiting gracefully.");
                scheduler.shutdown();
            } else {
                System.out.println("I am the daemon thread!");
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    public void stop() {
        running = false;
    }
}

