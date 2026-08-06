package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (n < 20) {
            System.out.println(n++);
        }
    }
}
