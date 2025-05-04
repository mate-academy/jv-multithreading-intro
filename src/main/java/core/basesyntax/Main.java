package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.setDaemon(true);
        Stream.of(myThread, myRunnable).forEach(Thread::start);
    }
}
