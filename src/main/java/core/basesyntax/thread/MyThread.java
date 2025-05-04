package core.basesyntax.thread;

public class MyThread extends Thread {
    private volatile boolean whoI;

    public MyThread(boolean whoI) {
        this.whoI = whoI;
    }

    @Override
    public void run() {
        while (whoI) {
            System.out.println("I am the daemon thread!");
        }
    }

    public void setWhoI(boolean whoI) {
        this.whoI = whoI;
    }
}
