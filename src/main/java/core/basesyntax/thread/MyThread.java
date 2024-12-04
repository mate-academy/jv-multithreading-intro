package core.basesyntax.thread;

public class MyThread extends Thread {
    int count = 0;

    @Override
    public void run() {
        while (count < 20) {
            System.out.println(count++);
        }
    }
}
