package BiPredicateBiFunctionBiConsumer;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiPredicate <Integer,Integer> bipredicate = (x,y) -> x %2 ==0 && y %2 ==0;
System.out.println(bipredicate.test(10, 12));
BiPredicate <String,Integer> bipredicate2 =(x,y)->x.length()  ==y;
System.out.println(bipredicate2.test("Nishant", 7));
	}

}
