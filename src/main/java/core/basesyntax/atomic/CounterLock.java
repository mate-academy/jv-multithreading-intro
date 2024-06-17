package core.basesyntax.atomic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {
    private int count = 0;
    private final Lock lock = new ReentrantLock();
    private String str = "";

    public void add() {
        lock.lock();
        try {
            str = str + count++ + "\n";
        } finally {
            lock.unlock();
        }
    }

    //  public void increment() {
    //    count++;
    //  }

    public int getCount() {
        return count;
    }

    public String getStr() {
        return str;
    }
}

