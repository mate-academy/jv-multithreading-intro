package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread myDeamonThread = new Thread(new MyRunnable());
        myDeamonThread.setDaemon(true);
        myThread.start();
        myDeamonThread.start();
        System.out.println("The programm is running in: " + Thread.currentThread().getName());
    }
}
