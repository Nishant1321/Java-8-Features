package Supplier;

import java.util.function.Supplier;

public class SupplierSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> number = () -> 1;
		Supplier<String>name =() -> "nishant";
		System.out.println(number.get());
		System.out.println(name.get());

	}

}
