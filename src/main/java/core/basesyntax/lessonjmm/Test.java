package core.basesyntax.lessonjmm;

public class Test {
    public static void main(String[] args) {
        Thread first = new MyThread("First");
        Thread second = new MyThread("Second");
        Thread third = new MyThread("Third");
        Thread fourth = new MyThread("Fourth");
        Thread fifth = new MyThread("Fifth");
        second.setPriority(10);
        first.start();
        second.start();
        System.out.println(first.getPriority() + " first prio");
        System.out.println(second.getPriority() + " sec prio");
        try {
            second.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Something went wrong!", e);
        }
        // the following statements will not be run until `second` thread finishes its execution
        fifth.setPriority(1);
        third.start();
        fourth.start();
        fifth.start();

        try {
            first.join();
            third.join();
            fourth.join();
            fifth.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Something went wrong!", e);
        }

        // the following statement will not be run until all other threads finish their execution
        System.out.println("Message in Main thread");
    }
}

