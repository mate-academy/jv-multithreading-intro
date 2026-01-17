package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");

            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
