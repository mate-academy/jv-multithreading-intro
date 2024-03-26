package core.basesyntax;

import core.basesyntax.thread.MyRunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
    }
}
