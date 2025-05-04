package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        };

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        });

        Thread thread2 = new Thread(runnable);
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
