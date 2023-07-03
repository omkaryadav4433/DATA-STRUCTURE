package STACK;

public class doubleeeStackkk {

	int[] arr;
	int size;
	int top1, top2;

	public doubleeeStackkk(int size) {
		this.size = size;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	public boolean isEmpty1() {
		return top1 == -1;

	}
	public boolean isEmpty2() {
		return top2 == size;

	}

	public boolean isfull() {
		return (top1 + 1) == top2;
	}

	public boolean push1(int data) {
		if(isfull()) {
			return false;
		}
		arr[++top1]=data;
		return true;

	}
	public boolean push2(int data) {
		if(isfull()) {
			return false;
			
		}
		arr[--top2]=data;
		return true;
	}
	
	public int pop1() {
		if(isEmpty1()) {
			return -999;
		}
		return arr[top1--];
		
	}
	public int pop2() {
		if(isEmpty1()) {
			return -999;	
		}
		return arr[top2++];
		
	}

}
