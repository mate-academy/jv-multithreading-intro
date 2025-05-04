package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is created with name: "
                + Thread.currentThread().getName());
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
