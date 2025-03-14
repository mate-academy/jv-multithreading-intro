package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private int end;

    public MyRunnable(int end) {
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = 0; i < end; i++) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
