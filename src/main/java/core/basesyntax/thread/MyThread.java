package core.basesyntax.thread;

public class MyThread extends Thread {
    public static final boolean SHOULD_PROCEED = true;

    @Override
    public void run() {
        while (SHOULD_PROCEED) {
            System.out.println("I am a daemon thread!");
        }
    }
}
