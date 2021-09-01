package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread myTread = new Thread(() -> {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        });
        Thread myDaemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("I am the daemon thread!");
                }
            }
        });
        myTread.start();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
    }
}
