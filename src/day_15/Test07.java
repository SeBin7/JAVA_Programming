package day_15;

import java.util.Set;
import java.util.TreeSet;

public class Test07 {

	public static void main(String[] args) {
		Set<Integer> names = new TreeSet<>();
		names.add(1);
		names.add(5);
		names.add(7);
		names.add(3);
		names.add(4);
		System.out.println(names);
		Set<PhoneInfo> phones = new TreeSet<>();
		phones.add(new PhoneInfo("PP","010"));
		phones.add(new PhoneInfo("KK","020"));
		phones.add(new PhoneInfo("AA","030"));
		phones.add(new PhoneInfo("CC","070"));
		System.out.println("==== Phone list ====");
		for(PhoneInfo data:phones){
			System.out.println(data);
		}
	}
}





