package day_13;

public class p425 {

	public static void main(String[] args) throws Exception {
		Sample s = new Sample();
		s.go();
		
		try {
			s.stop("No");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			s.getInedx('z');
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class NoExitException extends Exception {
	NoExitException() {
		super("존재하지 않는 데이터...");
	}
	NoExitException(String errMsg) {
		super(errMsg);
	}
}

class Sample {
	int getInedx(char c) throws NoExitException {
		String data = "Hello java!!";
		int index = data.indexOf(c);
		if(index == -1) {
			throw new NoExitException("없음");
		}
		return index;
	}
	
	void go() {
		System.out.println("====== Go ======");
	}
	void stop(String msg) throws Exception{
		if(msg.equals("No")) {
			throw new Exception("Stop 할 수 없음...");
		}
		System.out.println("======== Stop =========");
	}
}