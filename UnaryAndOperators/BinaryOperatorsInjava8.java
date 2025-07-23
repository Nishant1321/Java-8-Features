package UnaryAndOperators;

import java.util.function.BinaryOperator;

public class BinaryOperatorsInjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryOperator <Integer>binaryoperator1 = (x,y)->x + y;
System.out.println(binaryoperator1.apply(5, 4));

BinaryOperator <String>binaryoperator2 =(x,y)-> x.concat(y).toUpperCase();
System.out.println(binaryoperator2.apply("Nishant ", "Priti"));
	}

}
