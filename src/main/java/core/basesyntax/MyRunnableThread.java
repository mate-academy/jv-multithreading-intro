package core.basesyntax;

public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
