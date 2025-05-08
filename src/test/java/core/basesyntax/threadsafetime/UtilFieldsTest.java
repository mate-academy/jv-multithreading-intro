package core.basesyntax.threadsafetime;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

class UtilFieldsTest {

    @Test
    void dateConverter_multithreaded() throws InterruptedException {
        UtilFields instance = new UtilFields();
        List<String> dateStrings = List.of(
                "2025-05-15 12:30:06.287",
                "2025.05.15 12:30:06.287",
                "2025/05/15 12:30:06.287",
                "20250515123351",
                "20250519",
                "2025-05-15",
                "15-05-2025",
                "15052025",
                "15.05.2025",
                "15/05/2025"
        );

        int threadCount = 20;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int index = i % dateStrings.size();
            executor.submit(() -> {
                try {
                    String input = dateStrings.get(index);
                    Date result = instance.dateConverter(input);
                    System.out.printf("Thread %s - Input: %s => Output: %s%n",
                            Thread.currentThread().getName(), input, result);
                } catch (Exception e) {
                    System.err.printf("Thread %s - Failed to parse: %s%n",
                            Thread.currentThread().getName(), e.getMessage());
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await(); // Wait for all threads to complete
        executor.shutdown();
    }

    @Test
    void dateConverter() {
        System.out.println("dateConverter");
        UtilFields instance = new UtilFields();
        String d;
        Date date;

        d = "2025-05-15 12:30:06.287";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "2025.05.15 12:30:06.287";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "2025/05/15 12:30:06.287";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "20250515123351";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "20250519";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "2025-05-15";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "15-05-2025";
        date = instance.dateConverter(d);
        System.out.println(date);

        d = "15052025";
        date = instance.dateConverter(d);
        System.out.println(date);
    }
}