package core.basesyntax.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
    private Semaphore semaphore;
    private String name;

    public MyThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        {
            try {
                semaphore.acquire();
                System.out.println(name + " acquired the access");
                // some logic that should be available only to N threads at the same time
                System.out.println(name + " is going to release the access");
                semaphore.release();
            } catch (InterruptedException e) {
                System.out.println("Something went wrong for " + name);
            }
        }
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        MyThread first = new MyThread(semaphore, "First");
        MyThread second = new MyThread(semaphore, "Second");
        MyThread third = new MyThread(semaphore, "Third");
        MyThread fourth = new MyThread(semaphore, "Fourth");
        MyThread fifth = new MyThread(semaphore, "Fifth");

        first.start();
        second.start();
        third.start();
        fourth.start();
        fifth.start();

        first.join();
        second.join();
        third.join();
        fourth.join();
        fifth.join();
    }
}
