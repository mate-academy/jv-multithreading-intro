class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}