package core.basesyntax.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition bufferNotFull = lock.newCondition();
    final Condition bufferNotEmpty = lock.newCondition();

    final Object[] items = new Object[100];
    int putIndex, takeIndex, itemCount;

    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while (itemCount == items.length) {
                bufferNotFull.await();
            }
            items[putIndex] = x;
            if (++putIndex == items.length) {
                putIndex = 0;
            }
            ++itemCount;
            bufferNotEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (itemCount == 0) {
                bufferNotEmpty.await();
            }
            Object x = items[takeIndex];
            if (++takeIndex == items.length) {
                takeIndex = 0;
            }
            --itemCount;
            bufferNotFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }

    public Object[] getItems() {
        return items;
    }
}
