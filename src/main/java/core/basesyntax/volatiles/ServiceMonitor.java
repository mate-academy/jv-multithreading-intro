package core.basesyntax.volatiles;

public class ServiceMonitor extends Thread {

    private volatile boolean running = true;

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        int i = 0;
        while (running) {
            // Check the service's health...
            //System.out.println("Checking service health...");
            i++;
//      try {
//        Thread.sleep(100);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
        }

        System.out.println("Service monitor stopped.");
    }

    public void shutdown() {
        this.running = false;
    }
}
