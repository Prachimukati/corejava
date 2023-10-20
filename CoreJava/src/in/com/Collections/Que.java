package in.com.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que {
public static void main(String[] args) {
	Queue<Integer>num = new PriorityQueue<Integer>(Comparator.reverseOrder());
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	System.out.println(num);
	
    num.offer(10);
	System.out.println(num);
	
	System.out.println(num.peek());

	num.poll();
	System.out.println(num);
	
	num.remove();
	System.out.println(num);

}
}
