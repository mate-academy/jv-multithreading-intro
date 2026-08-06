package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
  public static void main(String[] args) throws ExecutionException {
    CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      return "Result of Future 1";
    });

    CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Result of Future 2");

    System.out.println("Future 2: " + future2.join());
    System.out.println("Future 1: " + future1.join());
  }
}
