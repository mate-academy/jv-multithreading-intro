package core.basesyntax.atomic;

public class MainLock {
    public static void main(String[] args) throws InterruptedException {
        CounterLock counter = new CounterLock();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 10000; i++) {
                counter.add();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.add();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getStr());
        System.out.println(counter.getCount() + " -count");
    }
}
