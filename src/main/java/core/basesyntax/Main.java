package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        // Створюємо та запускаємо потік, що успадковує Thread
        MyThread myThread = new MyThread();

        // Створюємо екземпляр Runnable
        MyRunnable myRunnable = new MyRunnable();
        // Створюємо потік на основі Runnable
        Thread daemonThread = new Thread(myRunnable);

        // Позначаємо потік як демон
        daemonThread.setDaemon(true);

        // Запускаємо обидва потоки
        myThread.start();
        daemonThread.start();
    }
}
