package core.basesyntax.thread;

import java.util.stream.Stream;

public class MyThread extends Thread{
    @Override
    public void run() {
        Stream.iterate(0, i -> i + 1)
                .limit(20)
                .forEach(System.out::println);
    }
}
