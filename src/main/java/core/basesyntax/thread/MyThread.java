package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        int counter = 0;
        while (counter < 20) {
            System.out.println("Current number " + counter);
            counter++;
        }
    }
}
