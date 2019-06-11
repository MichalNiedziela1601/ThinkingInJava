package concurrency.lab;

public class Lab1 implements Runnable {
	public static int count = 0;
	private final int id = count++;
	Lab1() {
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
		for (int i = 0; i < 5; i++) {
			new Thread(new Lab1()).start();
		}
		System.out.println("Lab1 - finish");
	}
}
