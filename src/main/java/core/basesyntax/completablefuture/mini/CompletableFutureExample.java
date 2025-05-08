package core.basesyntax.completablefuture.mini;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture
      .supplyAsync(() -> "21")
      .thenApply(n -> n + 2) // * not works
      .thenAccept(System.out::println);
  }
}
