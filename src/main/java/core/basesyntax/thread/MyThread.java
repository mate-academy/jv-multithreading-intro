package core.basesyntax.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }
    }
}
