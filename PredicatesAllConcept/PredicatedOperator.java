package PredicatesAllConcept;

import java.util.function.Predicate;

public class PredicatedOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate <String> startwith = x -> x.toLowerCase().charAt(0) == 'n';
		Predicate <String> endwith =x -> x.toLowerCase().charAt(x.length()-1)== 't';
		
		// And 
		Predicate<String> and =startwith.and(endwith);
		System.out.println(and.test("Kiran"));
     
		// Or
		System.out.println(startwith.or(endwith).test("Nisha"));
		
		//negate = that means restrict or ignore condition
		System.out.println(startwith.negate().test("m"));
		
		//isEqual = it check the condition equal to predicates
		// it is static method if u want to run and check the condition then use interface that means predicated for access;
		Predicate <String> ie = Predicate.isEqual("Nishant"); 
		System.out.println(ie.test("Nishant"));
		
	
	}

}
