package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread firstUserThread = new FirstUserThread();
        DaemonThread daemonThread = new DaemonThread();
        Thread runnableDaemonRThread = new Thread(daemonThread);
        runnableDaemonRThread.setDaemon(true);
        firstUserThread.start();
        runnableDaemonRThread.start();
    }

    static class FirstUserThread extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i <= 20) {
                System.out.println(i);
                i++;
            }
        }
    }

    static class DaemonThread implements Runnable {
        @Override
        public void run() {
            System.out.println("I am the daemon thread!");
        }
    }
}
