package core.basesyntax.thread;

public class MyThread extends Thread {
    private static ThreadLocal<Integer> threadLoopLocal = new ThreadLocal<>();

    @Override
    public void run() {
        threadLoopLocal.set(20);
        System.out.println("Hello from MyThread!");
        for (int i = 0; i < threadLoopLocal.get(); i++) {
            System.out.println("Number is : " + i);
        }
        System.out.println("MyThread is terminating its work!");
    }
}
