package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Adding a small delay to slow down the number printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
