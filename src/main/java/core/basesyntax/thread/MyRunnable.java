package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        final int maxNumber = 20;
        
        for (int i = 0; i <= maxNumber; i++) {
            System.out.println(i);
        }
    }
}
