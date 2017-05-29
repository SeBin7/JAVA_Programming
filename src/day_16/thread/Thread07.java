package day_16.thread;

public class Thread07 {
	public static void main(String[] args) {
		new  PushPop().start();
	}
}

class PushPop {
	MyStack stack = new MyStack();

	synchronized void push(int i) {
		if(stack.isFull()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack.push(i);
		System.out.println("push() <== " + i);
		notifyAll();
	}

	synchronized int pop() {
		if(stack.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack.pop();
		System.out.println("pop() ==> " + data);
		notifyAll();
		return data;
	}
	
	class Job3 implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i < 1000; i++) {
				push(i);
			}
		}
	}
	class Job4 implements Runnable {
		
		@Override
		public void run() {
			for (int i = 1; i < 1000; i++) {
				pop();
			}
		}
	}
	void start(){
		Job3 job3 = new Job3();
		Thread t1 = new Thread(job3);
		
		Job4 job4 = new Job4();
		Thread t2 = new Thread(job4);
		
		t1.start();
		t2.start();
	}
}

