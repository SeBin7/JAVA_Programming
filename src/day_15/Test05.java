package day_15;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Test05 {

	public static void main(String[] args) {
		Set<PhoneInfo> list = new HashSet();
		
		try(Scanner sc = new Scanner(new File("test01.txt"))){
		   while(sc.hasNextLine()){
			   String line = sc.nextLine();
			   String[] data = line.split(":");
			   list.add(new PhoneInfo(data[0],data[1]));
		   }
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(list.size());
		Iterator<PhoneInfo> i = list.iterator();
        while(i.hasNext()){
          PhoneInfo p = i.next();
          if(p.getName().equals("고길동")){
        	  i.remove();
          }
        }
		System.out.println(list.size());
		System.out.println("===== 목록보기 ====");
        for(PhoneInfo p:list){
        	System.out.println(p);
        }
        System.out.println("=============================");
        
       
	}
}


















