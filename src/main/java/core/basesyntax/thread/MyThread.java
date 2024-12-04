package core.basesyntax.thread;

public class MyThread extends Thread {
    private int count = 0;

    @Override
    public void run() {
        while (count <= 20) {
            System.out.println(count++);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
