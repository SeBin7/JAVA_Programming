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
		super("�������� �ʴ� ������...");
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
			throw new NoExitException("����");
		}
		return index;
	}
	
	void go() {
		System.out.println("====== Go ======");
	}
	void stop(String msg) throws Exception{
		if(msg.equals("No")) {
			throw new Exception("Stop �� �� ����...");
		}
		System.out.println("======== Stop =========");
	}
}