package core.basesyntax.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        int number = 0;

        while (number < 20) {
            System.out.println(number);
            number++;
        }
    }
}
