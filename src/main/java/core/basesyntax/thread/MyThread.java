package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int num = 0;
        while (num <= 20) {
            System.out.println(num++);
        }
    }
}
