package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count != 20) {
            count++;
        }
    }
}
