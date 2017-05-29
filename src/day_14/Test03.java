package day_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
		String[] data = {"~~", "bat", "sjdfo@jdfo.com", "010-4650-5463"};
		
		Pattern p = Pattern.compile("b.*");
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.printf(data[i] + ",");
		}
			
	}

}
