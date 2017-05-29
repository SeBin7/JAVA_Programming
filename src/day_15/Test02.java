package day_15;

import java.util.ArrayList;
import java.util.Arrays;

import day_12.Circle;

public class Test02 {
	public static void main(String[] args) {

		Object[]   obj = new Object[10];
		obj[0]= new PhoneInfo();
		obj[1] = new Circle();
		System.out.println(Arrays.toString(obj));
		
		PhoneInfo[] p1 = new PhoneInfo[10];
		p1[0]= new PhoneInfo();
		System.out.println(Arrays.toString(p1));

        ArrayList a1 = new ArrayList<>();
        a1.add(new PhoneInfo());
		a1.add(new Circle());
		
		System.out.println();

		ArrayList<PhoneInfo> a2 = new ArrayList<>();
        a2.add(new PhoneInfo());
        
	}
}





