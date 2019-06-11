package concurrency.lab;

class Fib1 implements Runnable {
	private int n;

	public Fib1(int n) {
		this.n = n;
	}

	public int fib(int x) {
		if(x < 2) return 1;
		return fib(x-2) + fib(x-1);
	}

	public void run() {
		for(int i = 0; i < n; i++)
			System.out.print("fib1 " + fib(i) + " ");
		System.out.println();
	}

}

class Fib2 implements Runnable {
	private int n;

	public Fib2(int n) {
		this.n = n;
	}

	public int fib(int x) {
		if(x < 2) return 1;
		return fib(x-2) + fib(x-1);
	}

	public void run() {
		for(int i = 0; i < n; i++)
			System.out.print("fib2 " + fib(i) + " ");
		System.out.println();
	}

}

class Fib3 implements Runnable {
	private int n;

	public Fib3(int n) {
		this.n = n;
	}

	public int fib(int x) {
		if(x < 2) return 1;
		return fib(x-2) + fib(x-1);
	}

	public void run() {
		for(int i = 0; i < n; i++)
			System.out.print("fib3 " + fib(i) + " ");
		System.out.println();
	}

}

public class Lab2  {

	public static void main(String[] args) {
		new Thread(new Fib1(15)).start();
		new Thread(new Fib2(15)).start();
		new Thread(new Fib3(15)).start();

	}


}
