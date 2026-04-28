package pekan4_2511531002;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531002 {
	public static void main(String[] args) {
		Queue<Integer> q_1002 = new LinkedList<Integer>();
		q_1002.add(1);
		q_1002.add(2);
		q_1002.add(3);
		System.out.println("sebelum reverse" + q_1002);
		Stack<Integer> s_1002 = new Stack<Integer>();
		while (!q_1002.isEmpty()) {
			s_1002.push(q_1002.remove());
		}
		while (!s_1002.isEmpty()) {
			q_1002.add(s_1002.pop());
		}
		System.out.println("Sesudah reverse = " + q_1002);
	}
}
