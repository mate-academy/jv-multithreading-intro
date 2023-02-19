package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here
    private static ThreadLocal<Integer> value = new ThreadLocal<>();

    @Override
    public void run() {
        for (int i = 0; i <= 20; ++i) {
            value.set(i);
            System.out.println(value.get());
        }
    }
}
