package day_03;

public class P157 {

	public static void main(String[] args) {
		//for while  - Ƚ���� ���������� for
		int hap =0;
		
		for(int i=1;i<11;i++){ // (�ʱⰪ;���ǽ�;������) ���ǽĿ��� ����ϴ�  ������ ���ǽ� �ȿ����� ��밡���Ѵ� scope
			
			hap += i;
			
			//��ø���� for ���� �����մϴ� .
			
		}
		 System.out.println(hap);
		 
		 
		 for(int i =1;i<3 ;i++ ){ //��ø�� �� ~
			 for(int k=10;k<15 ;k++ ){
				 System.out.printf("i = %d, k=%d %n", i, k);
			 }
			 System.out.println();
			 
		 }
	}

}
