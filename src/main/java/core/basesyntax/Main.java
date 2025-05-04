package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread demon = new MyThread();
        demon.setDaemon(true);
        
        Thread runnable = new Thread(new MyRunnable());
    
        demon.start();
        runnable.start();
    }
}
