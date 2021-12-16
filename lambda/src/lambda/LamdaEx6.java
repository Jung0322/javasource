package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaEx6 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;  
		System.out.println(s.get());
		
		Consumer<Integer> c = i -> System.out.println(i+" ");
		c.accept(15);
		
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(1));
	}

}
