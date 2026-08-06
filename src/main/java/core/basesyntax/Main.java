package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Runnable daemonThread = new DaemonThread();
        thread.start();
        Thread daemonRunnableThread = new Thread(daemonThread);
        daemonRunnableThread.setDaemon(true);
        daemonRunnableThread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }

    static class DaemonThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }
}

