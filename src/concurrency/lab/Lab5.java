package concurrency.lab;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Fib1a implements Callable<Integer> {
	private int n;

	public Fib1a(int n) {
		this.n = n;
	}

	public int fib(int x) {
		if(x < 2) return 1;
		return fib(x-2) + fib(x-1);
	}

	public Integer call() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += fib(i);
		}
		return sum;
	}
}

class Fib2a implements Callable<Integer> {
	private int n;

	public Fib2a(int n) {
		this.n = n;
	}

	public int fib(int x) {
		if(x < 2) return 1;
		return fib(x-2) + fib(x-1);
	}

	public Integer call() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += fib(i);
		}
		return sum;
	}
}

public class Lab5 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<Integer> task1 = exec.submit(new Fib1a(15));
		Future<Integer> task2 = exec.submit(new Fib2a(15));
		try {
			System.out.println("Fib1a sum: " + task1.get());
			System.out.println("Fib2a sum: " + task2.get());
		} catch (InterruptedException e) {
			System.out.println(e);
			return;
		} catch (ExecutionException e) {
			System.out.println(e);
			return;
		} finally {
			exec.shutdown();
		}

	}
}
