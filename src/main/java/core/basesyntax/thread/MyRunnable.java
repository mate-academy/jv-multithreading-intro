package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        IntStream.iterate(0, i -> i + 1).forEach(System.out::println);
    }
    // write your code here
}
