package core.basesyntax.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class DeadlockChecker implements Runnable {

        private final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        @Override
        public void run() {
             {
                long[] deadlockedThreadIds = threadMXBean.findDeadlockedThreads();
                
                if (deadlockedThreadIds != null) {
                    // Deadlock detected
                    ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreadIds);
                    System.out.println("Deadlock detected!");

                    for (ThreadInfo threadInfo : threadInfos) {
                        System.out.println("Thread ID: " + threadInfo.getThreadId());
                        System.out.println("Thread Name: " + threadInfo.getThreadName());
                        System.out.println("Blocked Time: " + threadInfo.getBlockedTime());
                        System.out.println("Blocked Count: " + threadInfo.getBlockedCount());
                        System.out.println("Lock Info: " + threadInfo.getLockInfo());
                        System.out.println("Lock Owner ID: " + threadInfo.getLockOwnerId());
                        System.out.println("Lock Owner Name: " + threadInfo.getLockOwnerName());
                        System.out.println("Thread State: " + threadInfo.getThreadState());
                        System.out.println("Stack Trace:");
                        for (StackTraceElement ste : threadInfo.getStackTrace()) {
                            System.out.println("\t" + ste.toString());
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("No deadlock detected.");
                }

                try {
                    // Sleep for a while before checking again
                    Thread.sleep(1000); // 5 seconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }