import java.util.ArrayDeque;

public class Main
{
	public static void main(String[] args) {
		ArrayDeque<Integer> pq=new ArrayDeque<>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(90);
		pq.offer(80);
		pq.offerFirst(98);
		pq.offerLast(99);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekFirst());
		System.out.println(pq.peekLast());
		pq.poll();
		System.out.println(pq);
		pq.pollFirst();
		System.out.println(pq);
		pq.pollLast();
		System.out.println(pq);
	}
}
