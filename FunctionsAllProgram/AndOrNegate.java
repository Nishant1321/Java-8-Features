package FunctionsAllProgram;

import java.util.function.Function;

public class AndOrNegate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String, String> function1=x -> x.toUpperCase();
Function<String,String> function2 =x ->x.substring(0, 3);
// call two way
// 1)
Function<String,String> answer =function1.andThen(function2);
System.out.println(answer.apply("Nishant"));
//2)
System.out.println( function1.andThen(function2).apply("Nishant"));
	}

}
