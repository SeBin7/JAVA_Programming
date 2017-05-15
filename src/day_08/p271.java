package day_08;

public class p271 {

	public static void main(String[] args) {
		p271 p = new p271();
		p.f(5);
	}
	
	long f(int n) {
		// 5*4*3*2*1
		long result = 1;
		
		/*for(int i=n; i>0; i--)
			result = result*i;*/
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * f(n - 1);
		}
		
		System.out.println(result);
		return result;
	}
}
