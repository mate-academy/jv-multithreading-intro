package core.basesyntax;

public class Main {
    public static void main(String[] args) {
       MyThread myThread = new MyThread();
       myThread.start();

       MyRunnable myRunnable = new MyRunnable();
       Thread thread = new Thread(myRunnable);
       thread.setDaemon(true);
       thread.start();
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
        }
    }
}
