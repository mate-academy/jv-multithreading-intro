package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample1 {
  public static void main(String[] args) throws ExecutionException {
    // It may look more functional!
    CompletableFuture.supplyAsync(CompletableFutureExample1::getString)
      .thenApply(result -> result + ", World!")
      .thenAccept(System.out::println)
            .join();

  }

  private static String getString() {
    // Simulate a long-running task

    try {
      TimeUnit.SECONDS.sleep(1); // instead of Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e); // instead of e.printStackTrace();
    }
    return "Hello";
  }
}
