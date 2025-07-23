package PredicatesAllConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOddUsingPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> IsEven = x -> x % 2==0;
List<Integer> n =Arrays.asList(1,2,3,4,5,6);
for(Integer i :n) {
	if(IsEven.test(i)) {
	System.out.println((i+ ": is Even"));
}
}

	}

}
