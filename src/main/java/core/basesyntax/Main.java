package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread threadExtends = new MyThread();
        Thread threadImplements = new Thread(new MyRunnable());
        threadImplements.setDaemon(true);
        threadImplements.start();
        threadExtends.start();
    }
}
