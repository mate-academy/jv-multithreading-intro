package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }
    }
}
