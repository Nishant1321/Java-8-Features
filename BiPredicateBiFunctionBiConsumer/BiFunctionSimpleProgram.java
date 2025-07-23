package BiPredicateBiFunctionBiConsumer;

import java.util.function.BiFunction;

public class BiFunctionSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<String,String,Integer> bifunction1 =(x,y) ->x.length() + y.length();
System.out.println(bifunction1.apply("Nishant", "Priti"));

BiFunction<Integer,Integer,Integer> bifunction2 =(x,y) -> x*x + y*y;
System.out.println(bifunction2.apply(5, 6));
	}

}
