package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int start = 0;
        while (start <= 20) {
            System.out.println(start);
            start++;
        }
    }
}
