package day_03;

public class P157 {

	public static void main(String[] args) {
		//for while  - 횟수가 정해져있음 for
		int hap =0;
		
		for(int i=1;i<11;i++){ // (초기값;조건식;증감식) 조건식에서 사용하는  변수는 조건식 안에서만 사용가능한다 scope
			
			hap += i;
			
			//중첩으로 for 루프 가능합니다 .
			
		}
		 System.out.println(hap);
		 
		 
		 for(int i =1;i<3 ;i++ ){ //중첩문 비교 ~
			 for(int k=10;k<15 ;k++ ){
				 System.out.printf("i = %d, k=%d %n", i, k);
			 }
			 System.out.println();
			 
		 }
	}

}
