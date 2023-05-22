package lesson18;

import java.util.Date;
import java.util.concurrent.*;

public class MyExecutor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final String s = "Hello form Thread ";
        System.out.println(s + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        final Future<Date> future = executorService.submit(() -> {
            {
                Date date = new Date();
                System.out.println(date);
                System.out.println(s + Thread.currentThread().getName());
                return date;
            }
        });

        Date dateFromFuture = future.get();
        System.out.println("Date from future: " + dateFromFuture);

        executorService.shutdown();
    }
}


