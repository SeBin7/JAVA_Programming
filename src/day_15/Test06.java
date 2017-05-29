package day_15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("kkk1");
		s.add("kkk2");
		s.add("kkk3");
		s.add("kkk4");
		s.add("kkk5");
		for(String data:s){
			System.out.println(data);
		}
		System.out.println("==============");
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			String data = i.next();
			System.out.println(data.charAt(data.length()-1));
			
		}
	}
}






