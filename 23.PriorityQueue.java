import java.util.PriorityQueue;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(90);
		pq.offer(80);
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
	}
}
