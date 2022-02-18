package core.basesyntax.thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (;;){
            System.out.println("I am the daemon thread!");
        }
    }
}
