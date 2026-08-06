package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();

        Thread thread2 = new Thread();
        thread2.setDaemon(true);
        thread2.start();
    }
}
