package day_13;

import java.util.function.Function;

public class Test05 {

	public static void main(String[] args) {
		System.out.println(new M1().max(100, 95));		
	
		F1 f1 = new F1() {

			@Override
			public int max(int a, int b) {
				return a>b? a:b;
			}
			
		};
		System.out.println(f1.max(85, 200));
		
		F1 f2 = (int a, int b) -> {
			return a>b ? a:b;
		};
		System.out.println(f2.max(52, 83));
		
		F1 f3 = (int a, int b) -> a>b ? a:b;
		System.out.println(f3.max(230, 95));
		
		F2 f4 = (int a, int b) -> a>b ? b:a;
		System.out.println(f4.min(230, 95));
		
		Function<String, Integer> stringToInt = (s) -> Integer.parseInt(s);
		int num = stringToInt.apply("54");
		System.out.println(num);
		
		Function<Integer, Integer> i = (a) -> a*20;
		System.out.println(i.apply(20));
	}
	
}
/*
@FunctionalInterface
interface Function<T, R> {
	R apply (T t);
}
*/
@FunctionalInterface
interface F1 {
	int max(int a, int b);
}

@FunctionalInterface
interface F2 {
	int min(int a, int b);
}

class M1 {
	public int max(int a, int b) {
		return a>b? a:b;
	}
}

