package core.basesyntax.interrupt;

public class MainInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        thread.start();

        Thread.sleep(1);
        thread.interrupt();

        System.out.println(" asked to stop thread");
    }

}
