package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is not dead! It name is: " + Thread.currentThread().getName());
        for (int i = 0; i <= 20; i++) {
            System.out.println("Let's count! Current number is: " + i);
        }
    }
}
