package core.basesyntax.thread;

public class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("i=" + i);
        }
    }
}
