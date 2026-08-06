package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionsExample {
    private static final Logger LOGGER = Logger.getLogger(ExceptionsExample.class.getName());

    private static int compute() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new RuntimeException("Ooops! Error!");
        }
        return 2;
    }

    private static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> compute());
    }

    public static void main(String[] args) {
        create()
                .thenApply(data -> data * 2)
                .thenAccept(data -> System.out.println("Result: " + data))
                .exceptionally(throwable -> {
                    handleException(throwable);
                    return null;
                }).thenRun(() -> System.out.println("Happy path completed"))
                .join();

    }

    private static void handleException(Throwable throwable) {
        LOGGER.log(Level.SEVERE, "Exception occurred", throwable);
    }
}
