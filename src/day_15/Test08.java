package day_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test08 {

	public static void main(String[] args) {
         Map<String, String> map1 = new HashMap<>();
         map1.put("url","jdbc:oracle:thin:@127.0.0.1:1521");
         map1.put("user", "hr");
         map1.put("pw", "hr");
         map1.put("driver", "oracle.jdbc.OracleDriver");
         
         Set<String> s  = map1.keySet();
         Iterator<String> i = s.iterator();
         while (i.hasNext()) {
			String key = (String) i.next();
			String value = map1.get(key);
			System.out.println(key+"="+value);
		}
	}
}


