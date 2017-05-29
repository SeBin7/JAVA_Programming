package day_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("test01.txt"));
		    while(sc.hasNextLine()){	
			    String data = sc.nextLine();
			    String[]  p= data.split(":");
			    PhoneInfo phone = new PhoneInfo(p[0],p[1]);
			    System.out.println(phone);
		    }
		} catch (FileNotFoundException e) {
			System.out.println("파일을 확인해 주세요.");
		}finally{
			if(sc != null) sc.close();
		}
		
        System.out.println("main end");
	}
}
