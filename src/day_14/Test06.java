package day_14;

public class Test06 {

	public static void main(String[] args) {
		Fun1<Double, Double, Double> f1 = (a, b) -> a>b?a:b;
		System.out.println(f1.max(6.9, 5.3));
		
		Fun1<Double, Double, Double> f2 = (a, b) -> a + b;
		System.out.println(f2.max(6.9, 5.3));
	}

}

@FunctionalInterface
interface Fun1<T, V, R> {
	R max(T a, V b);
}
/*
@FunctionalInterface
interface Function<T, R> {
	R apply (T t);
}

@FunctionalInterface
interface BiFunction<T, U, R> {
	R apply (T t, U u);
}
*/
