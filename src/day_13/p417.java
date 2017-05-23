package day_13;

import java.io.FileInputStream;
import java.io.IOException;

public class p417 {

	public static void main(String[] args) {
		System.out.println("======= Main Start =======");
		//FileInputStream fis = null;
		
		try(FileInputStream fis = new FileInputStream("test.txt")) {
			System.out.println((char)fis.read());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("ÀÚ¿ø ¹Ý³³");
			System.out.println();
/*			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
		
		
		
		
/*		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			System.out.println("¤¾.¤¾");
		}*/
		
		
		System.out.println("======== Main End ========");
	}

}
