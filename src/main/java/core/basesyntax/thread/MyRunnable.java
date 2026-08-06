package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static int numberValue = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            numberValue = i;
            System.out.println("The MyRunnable thread is running "
                    + Thread.currentThread().getName()
                    + " the number is: "
                    + numberValue);
        }
    }
}
