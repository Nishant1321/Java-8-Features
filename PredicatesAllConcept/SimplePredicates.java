package PredicatesAllConcept;
import java.util.*;
import java.util.function.Predicate;
public class SimplePredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> CheckCondition  = x -> x > 1000;
 System.out.println(CheckCondition.test(10000));
 int salary =10000;
 if(CheckCondition.test(salary)) {
	 System.out.println("nishant");
 }
	}

}
