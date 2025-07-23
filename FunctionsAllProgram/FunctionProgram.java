package FunctionsAllProgram;

import java.util.function.Function;

public class FunctionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 //1IP  2IP       OBJ              
		Function<String,Integer> function1 = x -> x.length();
		                           //Function
		System.out.println(function1.apply("Nishant"));
		
		Function<String,String> function2 =x -> x.toUpperCase().substring(0, 3);
		System.out.println(function2.apply("Nishant"));
		
	}

}
