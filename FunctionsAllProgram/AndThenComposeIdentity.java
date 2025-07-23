package FunctionsAllProgram;

import java.util.function.Function;

public class AndThenComposeIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Function<Integer,Integer> function1 = x -> x* 2;
 Function<Integer,Integer> function2 = x -> x*x*x;
 System.out.println(function1.andThen(function2).apply(3));//216
 System.out.println(function2.andThen(function1).apply(3));//54
 
 //compose
 System.out.println(function1.compose(function2).apply(3)); //54 similar work
 
 //identity static method
 
 Function<String , String> identityFun = Function.identity();
 System.out.println(identityFun.apply("Nishant"));  // return same as name which we give in input 
 
	}

}
