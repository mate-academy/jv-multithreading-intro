package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("I am the daemon thread! I Came Here to Drink Milk and Kick Ass, and I've Just Finished My Milk");
        }
    }
}
