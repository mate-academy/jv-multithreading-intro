package core.basesyntax.thread;

public class MyThread extends Thread {
    private static int COUNT = 0;

    @Override
    public void run() {
        while (COUNT < 20) {
            System.out.println(COUNT++);
        }
    }
}
