package core.basesyntax.thread;

public class MyThread extends Thread {
    int count = 0;

    @Override
    public void run() {
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }

    }
}
