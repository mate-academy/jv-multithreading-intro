package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyThread extends Thread {

    @Override
    public void run() {
        IntStream.range(0, 21).forEach(System.out::println);
    }
}
