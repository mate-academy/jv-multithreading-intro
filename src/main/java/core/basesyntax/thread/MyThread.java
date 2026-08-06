package core.basesyntax.thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My thread is created. Thread name is: " + getName());
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
