package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public void run() {
        threadLocal.set((int) (Math.random() * 100D));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // ignored
        }
        System.out.println(threadLocal.get());
    }
}
