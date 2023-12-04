package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        IntStream.range(0, 20).forEach(System.out::println);
    }
}
