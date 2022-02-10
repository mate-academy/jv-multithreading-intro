package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int res = 0;
        while (res <= 20) {
            System.out.println(res++);
        }
    }
}
