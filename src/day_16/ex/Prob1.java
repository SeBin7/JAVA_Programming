package day_16.ex;

import java.util.ArrayList;

public class Prob1 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	private static String[] stringSplit(String str1, String str2) {
		ArrayList<String> al = new ArrayList<>();
	    int point = 0;
		while(true){
			int i =  str1.indexOf(str2,point);
			if(i==-1){
				al.add(str1.substring(point));
				break;
			}
			al.add(str1.substring(point, i));
			point = i+1;
		}
		String[] result = new String[al.size()];
		al.toArray(result);
		return result;
	}	
}







