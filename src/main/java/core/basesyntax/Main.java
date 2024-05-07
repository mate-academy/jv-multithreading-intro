package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        class CounterThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i <= 20; i++) {
                    System.out.println(i);
                }
            }
        }

        Runnable runnable = () -> {
            while (Thread.currentThread().isAlive()) {
                System.out.println("I am the daemon thread!");
            }
        };

        Thread daemonThread = new Thread(runnable);
        daemonThread.setDaemon(true);
        CounterThread counterThread = new CounterThread();

        daemonThread.start();
        counterThread.start();
    }
}
