package concurrency.lab;

import concurrency.LiftOff;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab3 implements Runnable {
	public static int count = 0;
	private final int id = count++;
	Lab3() {
		System.out.println("#" + id + ": Lab 1 - constructor");
	}

	@Override public void run() {
		System.out.println("#" + id +": Lab1 - start run 1");
		Thread.yield();
		System.out.println("#" + id +": Lab1 - start run 2");
		Thread.yield();
		System.out.println("#" + id +": Lab1 - start run 3");
		Thread.yield();
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new Lab3());
		}
		exec.shutdown();
		System.out.println("Lab1 - finish");

		ExecutorService exec1 = Executors.newFixedThreadPool(5);
		for(int i = 0; i< 5; i++)
			exec1.execute(new Lab3());
		exec1.shutdown();
	}
}
