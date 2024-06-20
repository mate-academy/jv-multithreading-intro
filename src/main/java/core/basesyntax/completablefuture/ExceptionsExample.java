package core.basesyntax.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionsExample {
   private static int compute() {
       if (true) {
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
             .thenAccept(data -> System.out.println(data))
             .exceptionally(throwable -> handleException(throwable));
   }
   
   private static Void handleException(Throwable throwable) {
     System.out.println(throwable);
     throw new RuntimeException("The pipeline could not be recovered!");
   }
}
