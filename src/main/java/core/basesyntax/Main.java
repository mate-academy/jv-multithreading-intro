package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new NumberThread();

        Thread daemonRunnable = new Thread(new DaemonRunnable());
        daemonRunnable.setDaemon(true);

        numberThread.start();
        daemonRunnable.start();
    }
}
class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class DaemonRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}