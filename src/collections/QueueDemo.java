package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

	private static void print(Queue queue) {
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i +10));
		}
		print(queue);
		Queue<Character> bc = new LinkedList<Character>();
		for(char c : "Brontozaur".toCharArray()) {
			bc.offer(c);
		}
		print(bc);
	}
}