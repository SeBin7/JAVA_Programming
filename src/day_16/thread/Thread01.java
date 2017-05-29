package day_16.thread;

public class Thread01 {
	public static void main(String[] args) {
       System.out.println("== main start ==");

       Job1 job1 = new Job1();
       Thread thread1 = new Thread(job1);
       
       
       Job2 job2 = new Job2();
       Thread thread2 = new Thread(job2);
       
       thread1.start();
       thread2.start();
       
       System.out.println("== main end ==");
	}
}

class Job1 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i < 1000; i = i + 2) {
			sum += i;
			System.out.println("È¦¼öÇÕ ~ " + i + " =" + sum);
		}
	}
}

class Job2 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i = i + 2) {
			sum += i;
			System.out.println("Â¦¼öÇÕ ~ " + i + " =" + sum);
		}
	}
}