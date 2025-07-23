package UnaryAndOperators;

import java.util.function.UnaryOperator;

public class UnaryOperatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//its use in Function when special type of data is consist same data type when we use unary Operators
		UnaryOperator <Integer> UnaryOperatprs1= (x) -> x * x;
		System.out.println(UnaryOperatprs1.apply(5));
		
		UnaryOperator <String> UnaryOperator2 = y-> y.toLowerCase();
		System.out.println(UnaryOperator2.apply("NISHANT"));
		
	}

}
