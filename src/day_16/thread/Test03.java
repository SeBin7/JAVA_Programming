package day_16.thread;


public class Test03 {

	public static void main(String[] args) {
        System.out.println("Start");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("End");
	}
}
