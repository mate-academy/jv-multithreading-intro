package core.basesyntax.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCalculator implements Callable<Long> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int number = 5;
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Long> factorialCalculator = new FactorialCalculator(number);
        Future<Long> future = executorService.submit(factorialCalculator);

        // Wait for the calculation to complete and retrieve the result
        long result = future.get();

        System.out.println("Factorial of " + number + " is " + result);

        executorService.shutdown();
    }
}
