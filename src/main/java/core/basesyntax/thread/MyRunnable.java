package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        IntStream.iterate(0, i -> i + 1).limit(20).forEach(System.out::println);
    }
}
