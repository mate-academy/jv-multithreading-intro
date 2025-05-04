package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int TWENTY = 20;

    @Override
    public void run() {
        for (int i = 0; i <= TWENTY; i++) {
            System.out.println(i);
        }
    }
}
