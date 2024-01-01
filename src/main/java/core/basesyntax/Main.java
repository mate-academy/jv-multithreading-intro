package core.basesyntax;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ThreadWithNumbers threadWithNumbers = new ThreadWithNumbers();
        DaemonThead daemonThreadHelper = new DaemonThead();
        Thread daemonThread = new Thread(daemonThreadHelper);
        daemonThread.setDaemon(true);
        threadWithNumbers.start();
        daemonThread.start();
    }

    static class ThreadWithNumbers extends Thread {
        @Override
        public void run() {
            IntStream.rangeClosed(0, 20)
                    .forEach(System.out::println);
        }
    }

    static class DaemonThead implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }
}


