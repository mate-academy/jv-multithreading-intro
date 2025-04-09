package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        int number = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println(number);
            number++;
        }
    }
}
