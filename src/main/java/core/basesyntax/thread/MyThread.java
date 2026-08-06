package core.basesyntax.thread;

public class MyThread extends Thread {
    private int counter = 0;

    @Override
    public void run() {
        while (counter < 21) {
            System.out.println(counter);
            counter++;
        }
    }
}
