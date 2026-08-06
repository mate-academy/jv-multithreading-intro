package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int max = 20;
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }
}
