package core.basesyntax.thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("The printed number is: %s%n", i);
        }
    }
}
