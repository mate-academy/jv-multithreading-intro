package core.basesyntax;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        DaemonThread daemonRunnable = new DaemonThread();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true);
        t1.start();
        daemonThread.start();
    }
}