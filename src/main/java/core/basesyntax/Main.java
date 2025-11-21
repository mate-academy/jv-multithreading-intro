package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread("Default thread");
        myThread.start();

        Thread myDaemonThread = new MyDaemonThread("Daemon thread");
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class MyDaemonThread extends Thread {
    public MyDaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I'm Daemon Thread!");
        }
    }
}