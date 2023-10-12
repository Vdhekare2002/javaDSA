package Queues;
import java.util.*;
public class Deqye {
//double ended queue
	public static void main(String[] args) {
		Deque<Integer> deque = new  LinkedList<>();
		deque.addFirst(1);//1
		deque.addFirst(2);// 2 1
		deque.addFirst(3);// 2 1 3
		deque.addFirst(4);// 2 1 3 4
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque);
	   System.out.println(" first element = "+ deque.getFirst());
	   System.out.println("Last element = "+ deque.getLast());
	}

}
