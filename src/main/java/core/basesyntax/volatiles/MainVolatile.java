package core.basesyntax.volatiles;

import java.util.concurrent.TimeUnit;

public class MainVolatile {
    public static void main(String[] args) throws InterruptedException {
        ServiceMonitor serviceMonitor = new ServiceMonitor();
        serviceMonitor.start();
        TimeUnit.SECONDS.sleep(2);
       // serviceMonitor.shutdown();
        serviceMonitor.setRunning(false);
    }
}
