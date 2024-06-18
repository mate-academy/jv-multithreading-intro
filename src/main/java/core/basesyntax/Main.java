package core.basesyntax;

import core.basesyntax.thread.DaemonThreadExample;
import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory() / 1024 / 1024);
        System.out.println(runtime.freeMemory() / 1024 / 1024);
        System.out.println(runtime.totalMemory() / 1024 / 1024);
//        Thread t2 = new MyThread();
//        t2.start();
//        MyRunnable myRunnable = new MyRunnable();
//        Thread t1 = new Thread(myRunnable);
//        t1.setDaemon(true);
//        t1.start();
//        Thread daemonThread = new Thread(new DaemonThreadExample());
//        daemonThread.setDaemon(true);
//        daemonThread.start();
      System.out.println("Main thread is ending.");
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        thread1.start();
        thread2.start();
    }
}
