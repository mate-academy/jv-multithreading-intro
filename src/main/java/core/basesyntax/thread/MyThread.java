package core.basesyntax.thread;

import java.util.stream.IntStream;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName());
        IntStream.rangeClosed(0, 20)
                .forEach(System.out::println);
    }
}
