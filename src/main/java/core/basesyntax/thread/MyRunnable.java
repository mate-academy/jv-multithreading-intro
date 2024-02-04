package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyRunnable implements Runnable {
    private static final int START_RANGE = 0;
    private static final int END_RANGE = 20;

    @Override
    public void run() {
        IntStream.range(START_RANGE, END_RANGE).forEach(System.out::println);
    }
}
