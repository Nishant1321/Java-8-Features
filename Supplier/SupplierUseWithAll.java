package Supplier;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierUseWithAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate <Integer> predicate = s -> s %2 ==0;
		Function<Integer,Integer>function=x -> x * x;
		Consumer<Integer>consumer= c -> System.out.println(c);
		Supplier<Integer>supplier= () ->100;
		
		if(predicate.test(supplier.get())) {
		consumer.accept(function.apply(supplier.get()));
			
		}
	}

}
