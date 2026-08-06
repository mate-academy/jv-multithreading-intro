package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    private static ThreadLocal<Integer> nums = new ThreadLocal<>();

    @Override
    public void run() {
        nums.set(new Random().nextInt(20));
        System.out.println(nums.get());
    }
}
