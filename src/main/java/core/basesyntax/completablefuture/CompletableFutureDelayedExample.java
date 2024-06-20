package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDelayedExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("Task completed after a delay." + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Task interrupted.");
      }
    });
    CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("Task completed after a delay." + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Task interrupted.");
      }
    });
    CompletableFuture<Void> future3 = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("Task completed after a delay." + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Task interrupted.");
      }
    });
    CompletableFuture<Void> future4 = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("Task completed after a delay." + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Task interrupted.");
      }
    });

    CompletableFuture<Void> delayed = future.thenRunAsync(() -> System.out.println("Running delayed task."  + Thread.currentThread().getName()));
    CompletableFuture<Void> delayed2 = future2.thenRunAsync(() -> System.out.println("Running delayed task."  + Thread.currentThread().getName()));
    CompletableFuture<Void> delayed3 = future3.thenRunAsync(() -> System.out.println("Running delayed task."  + Thread.currentThread().getName()));
    CompletableFuture<Void> delayed4 = future4.thenRunAsync(() -> System.out.println("Running delayed task."  + Thread.currentThread().getName()));
    Thread.sleep(500);
    System.out.println("Main thread continues execution."  + Thread.currentThread().getName());
    delayed.get();
    delayed2.get();
    delayed3.get();
    delayed4.get();
  }
}
