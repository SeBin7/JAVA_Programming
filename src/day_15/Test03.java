package day_15;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		List<PhoneInfo> list = new ArrayList<>();

		try (Scanner sc = new Scanner(new File("test01.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(":");
				list.add(new PhoneInfo(data[0], data[1]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			if (list.get(i).getName().equals("고길동"))
				list.remove(i);
			i--;
		}
		System.out.println(list.size());
		System.out.println("===== 목록보기 ====");
		for (PhoneInfo p : list) {
			System.out.println(p);
		}
		System.out.println("=============================");

		Iterator<PhoneInfo> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
