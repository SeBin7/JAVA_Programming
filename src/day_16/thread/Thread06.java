package day_16.thread;

public class Thread06 {
	MyStack stack = new MyStack();
	
	public void push(int i){
		stack.push(i);
        System.out.println("push() <== "+i);
	}
	public int pop(){
		int i = stack.pop();
        System.out.println("pop() ==> "+i);
        return i;
	}
	void start(){
		   Job1 job1 = new Job1();
	       Thread thread1 = new Thread(job1);
	       
	       
	       Job2 job2 = new Job2();
	       Thread thread2 = new Thread(job2);
	       
	       thread1.start();
	       thread2.start();
	}
	public static void main(String[] args) {
       System.out.println("== main start ==");

       new Thread06().start();
       
       System.out.println("== main end ==");
	}
	class Job1 implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i < 100; i++) {
				push(i);
			}
		}
	}

	class Job2 implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i < 100; i++) {
				pop();
			}
		}
	}
}

