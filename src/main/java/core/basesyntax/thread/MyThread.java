package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i <= 20) {
            System.out.println("Current number: " + i);
            i++;
        }
    }
}
