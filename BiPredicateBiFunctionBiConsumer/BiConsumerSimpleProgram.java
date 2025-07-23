package BiPredicateBiFunctionBiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<Integer,Integer>biconsumer1 = (x,y)->{
	System.out.println(x+y);
};
biconsumer1.accept(5, 6);

BiConsumer<String,String>boconsumer2 =(st1,st2)->{
	System.out.println(st1.concat(st2).length());
};
boconsumer2.accept("Nishant", "Priti");
	}

	
}
