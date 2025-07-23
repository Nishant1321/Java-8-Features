package PredicatesAllConcept;

import java.util.function.Predicate;

public class UsingStringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String> CheckLetter = x -> x.toLowerCase().charAt(0)=='n';
System.out.println(CheckLetter.test("nishant"));
	}

}
