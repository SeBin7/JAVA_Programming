package day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		int[] n = {8,5,6,9,3,5,7,8};
		System.out.println(Arrays.toString(n));
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(5);
        a.add(7);
        a.add(1);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Object[] ii = a.toArray();
        System.out.println(ii[0].getClass().getTypeName());
        
        Set<Integer> set = new HashSet<>();
        set.add(44);
        set.add(41);
        set.add(44);
        set.add(43);
        System.out.println(set);
        //Collections.sort(set.);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
			Integer data = (Integer) iterator.next();
			System.out.println(data);
		}
        for(Integer data:set){
        	System.out.println(data);
        }
	}
}










