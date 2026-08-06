package core.basesyntax.thread;

public class MyThread extends Thread {
    public void run() {

        for (int i = 0; i <= 20; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // write your code here
}
