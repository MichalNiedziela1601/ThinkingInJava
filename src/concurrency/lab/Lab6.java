package concurrency.lab;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Lab6 implements Runnable {

    @Override
    public void run() {
        try {
            Random rand = new Random();
            int second = rand.nextInt(10) +1;
            TimeUnit.MILLISECONDS.sleep(second * 100);
            System.out.println("random time: " + second);
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        int count = 0;
        if(args.length == 0) {
            count = 5;
        } else {
            count = Integer.valueOf(args[0]);
        }
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < count; i++) {
            exec.execute(new Lab6());
        }
        exec.shutdown();
    }
}
