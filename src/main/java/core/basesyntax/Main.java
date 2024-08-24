package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        Thread second = new Thread(new DaemonThread());
        second.setDaemon(true);
        first.start();
        second.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0;i < 21; i++) {
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
