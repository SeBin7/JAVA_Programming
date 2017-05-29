package day_16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "java01");
        map.put("pw", "1234");
        map.put("url", "jdbc:~~~");
        map.put("id", "java04");
        System.out.println(map);
        String s = map.get("id");
        System.out.println(s);
        map.remove("url");
        System.out.println(map);
        Set<String> keys =  map.keySet();
        System.out.println(keys);
        Iterator<String> ki = keys.iterator();
        while (ki.hasNext()) {
			String keyname = (String) ki.next();
			String value = map.get(keyname);
			System.out.println(keyname +" => "+value);
		}        
	}
}















