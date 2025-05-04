package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstTread = new MyThread("FirstTread");
        firstTread.setDaemon(true);
        firstTread.start();

        Runnable myRunnable = new MyRunnable();
        Thread secondTread = new Thread(myRunnable, "SecondTread");
        secondTread.start();
    }
}
