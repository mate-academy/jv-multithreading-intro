package core.basesyntax.thread;

public class MyThread extends Thread {
    private int number = 0;

    @Override
    public void run() {
        while (number <= 20) {
            System.out.println(number);
            number++;
        }
    }
}
