package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Example {
    public static CompletableFuture<String> create() {

        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello mates!";
        });
    }

    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(100);
        create()
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println)
                .thenRun(() -> System.out.println("This never dies!"))
                .thenRun(() -> System.out.println("Really, this never dies!"));
        Thread.sleep(1100);
    }
}
