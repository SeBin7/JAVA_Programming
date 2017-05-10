package day_05;

public class p241 {

	public static void main(String[] args) {
		TV[] tv = new TV[2];			//배열 생성
		for(int i=0; i<tv.length; i++)
			tv[i] = new TV();			//클래스 생성
		
		tv[0].color = "red";
		tv[0].display();
		
		tv[1].color = "blue";
		tv[1].display();
		//System.out.println();
	}

}
