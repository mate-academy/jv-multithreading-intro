package core.basesyntax.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int number = 0; number <= 20; number++) {
            System.out.println(number);
        }
    }
}
