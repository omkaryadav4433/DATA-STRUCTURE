package STACK;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		stack<Integer> si=new stack<Integer>(5);
		System.out.println(si.push(100));
		System.out.println(si.push(200));
		System.out.println(si.push(300));
		System.out.println(si.push(400));
		System.out.println(si.push(500));
		System.out.println(si.pop());
		

	}

}
