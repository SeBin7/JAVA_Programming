package day_15;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test09 {

	public static void main(String[] args) {
        Map<String, PhoneInfo> phoneList = new HashMap<>();
        try(Scanner sc = new Scanner(new File("test01.txt"))){
 		   while(sc.hasNextLine()){
 			   String line = sc.nextLine();
 			   String[] data = line.split(":");
 			   phoneList.put(data[1],new PhoneInfo(data[0],data[1]));
 		   }
 		}catch(Exception e){
 			e.printStackTrace();
 		}
        
        Set<String> s  = phoneList.keySet();
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
			String key = (String) i.next();
			PhoneInfo value = phoneList.get(key);
			System.out.println(key+"="+value);
		}
        
        phoneList.clear();
        System.out.println(phoneList);
	}
}
