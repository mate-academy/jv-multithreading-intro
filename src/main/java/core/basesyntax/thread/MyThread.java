package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }
    }
}
