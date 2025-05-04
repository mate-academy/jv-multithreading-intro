package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 21) {
            System.out.println(i);
            i += 1;
        }
    }
}
