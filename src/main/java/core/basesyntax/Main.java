package core.basesyntax;

import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myTread = new MyThread();
        Thread myDaemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("I am the daemon thread!");
                }
            }
        });
        myTread.start();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
    }
}
