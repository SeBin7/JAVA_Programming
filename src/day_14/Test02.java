package day_14;

public class Test02 {
	public static void main(String[] args) {
		String msg = "ȫ�浿:90/��浿:80/��浿:70";
		String [] data1 = msg.split("/");
		int sum = 0;
		
		for (int i=0; i<data1.length; i++) {
			String[] d = data1[i].split(":");
			/*for(int j=0; j<d.length; j++)
				System.out.println(d[j]);*/
			sum += Integer.parseInt(d[1]); 
			System.out.println(d[0] + "�л� => " + d[1] + "��");
			
		}
		
		System.out.println("���� => " + sum + ", ��� => " + sum/data1.length);

	}
}
