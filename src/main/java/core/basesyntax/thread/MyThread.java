package core.basesyntax.thread;

public class MyThread extends Thread {
    // write your code here
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("NumberValue is: " + i);
        }
    }
}
