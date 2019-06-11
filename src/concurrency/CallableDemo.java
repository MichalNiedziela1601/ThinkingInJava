package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TestCallableResult implements Callable<String> {
	private int id;

	public TestCallableResult(int id) {
		this.id = id;
	}

	public String call() {
		return "Result TestCallbackResult " + id;
	}
}
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> futureList = new ArrayList<>();
		for(int i =0; i < 10; i++)
			futureList.add(exec.submit(new TestCallableResult(i)));
		for(Future<String> rs : futureList)
			try {
				System.out.println(rs.get());
			} catch (InterruptedException ex) {
				System.out.println(ex);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
				return;
			} finally {
				exec.shutdown();
			}
	}
}
