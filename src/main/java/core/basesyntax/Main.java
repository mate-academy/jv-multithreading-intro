package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.setDaemon(true);
        t1.start();
        Thread t2 = new MyThread1();
        t2.start();
    }
    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                i--;
                System.out.println("I am the daemon thread!");
            }
        }
    }
}

