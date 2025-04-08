package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final Integer LIMIT = 20;
    private static final ThreadLocal<Integer> number = new ThreadLocal<>();

    @Override
    public void run() {
        for (int i = 0; i <= LIMIT; i++) {
            number.set(i);
            System.out.println(number.get());
        }
    }
}
