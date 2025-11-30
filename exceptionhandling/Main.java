package exceptionhandling;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> response = CompletableFuture
                .supplyAsync(() -> divideAsync(10, 2))
                .thenApplyAsync(result -> addAsync(result, 5))
                .thenApplyAsync(result -> divideAsync(result, 10))
                .exceptionally(ex -> {
                    System.out.println("Caught an exception: " + ex.getMessage());
                    return null;
                });
        System.out.println("Result: " + response.get());
    }

    public static int divideAsync(int a, int b) {
        Date startTime = new Date();
        try {
            Thread.sleep(new Random().nextLong(5000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time elapsed in divide: " + (new Date().getTime() - startTime.getTime()) + " ms");
        return a/b;
    }

    public static int addAsync(int a, int b) {
        Date startTime = new Date();
        try {
            Thread.sleep(new Random().nextLong(4000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time elapsed in add: " + (new Date().getTime() - startTime.getTime()) + " ms");
        return a+b;
    }
}
