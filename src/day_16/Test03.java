package day_16;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import day_15.PhoneInfo;

public class Test03 {
	public static void main(String[] args) {
        PhoneInfo[] ph = 
           {
        		   new PhoneInfo("ȫ�浿1", "010-222-3339"),
        		   new PhoneInfo("ȫ�浿2", "010-222-3313"),
        		   new PhoneInfo("ȫ�浿3", "010-222-3337"),
        		   new PhoneInfo("ȫ�浿4", "010-222-3323")
           };
        
        ArrayList<PhoneInfo> alist = new ArrayList<>();
        alist.add(new PhoneInfo("ȫ�浿1", "010-212-3339"));
        alist.add(new PhoneInfo("ȫ�浿2", "010-221-3339"));
        alist.add(new PhoneInfo("ȫ�浿3", "010-212-3339"));
        alist.add(new PhoneInfo("ȫ�浿4", "010-212-3331"));
        
        Set<PhoneInfo> set = new HashSet<>();
        set.add(new PhoneInfo("ȫ�浿1", "010-212-3339"));
        set.add(new PhoneInfo("ȫ�浿2", "010-221-3339"));
        set.add(new PhoneInfo("ȫ�浿3", "010-212-3339"));
        set.add(new PhoneInfo("ȫ�浿4", "010-212-3331"));

        Map<String, PhoneInfo> map = new HashMap<>();
        try(Scanner scanner = new Scanner(new File("test01.txt"))){
           while(scanner.hasNextLine()){
        	   String line = scanner.nextLine();
        	   String[] data = line.split(":");
        	   PhoneInfo p = new PhoneInfo(data[0], data[1]);
        	   map.put(p.getName(), p);
           }
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.out.println("== List =="); 
        Set<String> names =  map.keySet();
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
			String name = (String) i.next();
			PhoneInfo p = map.get(name);
			System.out.println(p.getName()+"-"+p.getPhoneNumber());
		}
        System.out.println("�˻��� �̸��� �Է��ϼ���");
        String name ="��浿";
        PhoneInfo value =  map.get(name);
        System.out.println("�˻���� :"+map.get(name));
        System.out.println("��ȭ��ȣ : "+value.getPhoneNumber());
        
	}
}









