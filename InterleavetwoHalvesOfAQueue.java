package Queues;
import java.util.*;
public class InterleavetwoHalvesOfAQueue {
   /* Interleave 2 Halves of a Queue(even length)
    * 1 2 3 4 5 6 7 8 9 10
    * 1 6 2 7 3 8 4 9 5 10
    */
	public static void interLeave(Queue<Integer>q) {
	 Queue<Integer>	firsthalf= new LinkedList<>();
	 int size= q.size();
	 for(int i=0;i<size/2;i++) {
		firsthalf.add( q.remove());
	 }
	 while(!firsthalf.isEmpty()) {
		 q.add(firsthalf.remove());
		 q.add(q.remove());
	 }
	}
	public static void main(String[] args) {
		Queue<Integer>q= new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.add(10);
		interLeave(q);
		//print(Q).
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}
		System.out.println();
	}

}
