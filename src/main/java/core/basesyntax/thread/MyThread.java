package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final ThreadLocal<Integer> numberValue = new ThreadLocal<>();

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        numberValue.set(0);
        for (numberValue.get(); numberValue.get() <= 20; numberValue.set(numberValue.get() + 1)) {
            System.out.printf("%s is running: NumberValue is %d%n",
                    Thread.currentThread().getName(), numberValue.get());
        }
    }
}
