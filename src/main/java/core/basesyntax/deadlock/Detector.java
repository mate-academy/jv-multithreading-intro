package core.basesyntax.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

public class Detector {
    public static String detectDeadLocks() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadLocks = threadMXBean.findDeadlockedThreads();

        return Arrays.toString(deadLocks);
    }
}
