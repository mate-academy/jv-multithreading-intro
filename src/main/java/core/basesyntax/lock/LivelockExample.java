package core.basesyntax.lock;

import static java.lang.Thread.sleep;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LivelockExample {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);


    public static void main(String[] args) {
        LivelockExample livelock = new LivelockExample();
        try {
            new Thread(() -> {
                try {
                    livelock.operation1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T1").start();
            new Thread(() -> {
                try {
                    livelock.operation2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T2").start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void operation1() throws InterruptedException {
        while (true) {
            tryLock(lock1, 50);
            System.out.println("lock1 acquired, trying to acquire lock2.");
            sleep(50);

            if (tryLock(lock2)) {
                System.out.println("lock2 acquired.");
            } else {
                System.out.println("cannot acquire lock2, releasing lock1.");
                lock1.unlock();
                continue;
            }

            System.out.println("executing first operation.");
            break;
        }
        lock2.unlock();
        lock1.unlock();
    }
    
    public void operation2() throws InterruptedException {
        while (true) {
            tryLock(lock2, 50);
            System.out.println("lock2 acquired, trying to acquire lock1.");
            sleep(50);

            if (tryLock(lock1)) {
                System.out.println("lock1 acquired.");
            } else {
                System.out.println("cannot acquire lock1, releasing lock2.");
                lock2.unlock();
                continue;
            }

            System.out.println("executing second operation.");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    private boolean tryLock(Lock lock) {
        return lock.tryLock();
    }

    private void tryLock(Lock lock, int milis) throws InterruptedException {
        lock.tryLock(milis, TimeUnit.MILLISECONDS);
    }
}