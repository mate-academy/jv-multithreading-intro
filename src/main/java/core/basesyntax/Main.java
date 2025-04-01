package core.basesyntax;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
                while(true) {
                    System.out.println("I am the daemon thread!");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        Thread thread1 = new MyThread("Prints number");
        thread1.start();
    }

}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " prints: " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
