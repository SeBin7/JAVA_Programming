package day_15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P605 {
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push("0");
		st.push("1");
		st.push("2");

		
		Queue q = new LinkedList();	 

		q.offer("0");
		q.offer("1");
		q.offer("2");
	}
}
