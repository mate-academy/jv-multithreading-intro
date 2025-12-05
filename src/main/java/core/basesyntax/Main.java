package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new NumberThread();

        Thread daemonThread = new Thread(new DaemonRunnable());
        daemonThread.setDaemon(true);

        numberThread.start();
        daemonThread.start();
    }

    static class NumberThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }

    static class DaemonRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }
}

