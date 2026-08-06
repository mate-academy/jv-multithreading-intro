package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here
    private static final ThreadLocal<Integer> numberValue = new ThreadLocal<>();

    public void run() {
        for (int i = 0; i <= 20; i++) {
            numberValue.set(i);
            System.out.printf("%d%n", numberValue.get());
        }
    }
}
