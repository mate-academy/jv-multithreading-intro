package core.basesyntax.thread;

public class MyThread extends Thread{
    private int index = 0;
    @Override
    public void run() {
        while (index < 21) {
            System.out.println(index);
            index++;
        }
    }
}
