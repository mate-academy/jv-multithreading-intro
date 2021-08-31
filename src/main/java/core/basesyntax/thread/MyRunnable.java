package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        IntStream.rangeClosed(0, 20)
                .forEach(System.out::println);
    }
}
