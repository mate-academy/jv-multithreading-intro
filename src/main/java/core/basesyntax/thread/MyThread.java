package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            i++;
            System.out.println(i);
        }
    }
}
