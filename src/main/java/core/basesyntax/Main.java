package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        NumberPrinterThread numberThread = new NumberPrinterThread();

        DaemonPrinter daemonRunnable = new DaemonPrinter();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true);

        daemonThread.start();
        numberThread.start();
    }

    static class NumberPrinterThread extends Thread {
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

    static class DaemonPrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
