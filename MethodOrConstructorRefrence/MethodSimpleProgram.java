package MethodOrConstructorRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class MethodSimpleProgram {

	public static void Print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// it can be used for reference operator
	List<String> student =Arrays.asList("Nishant","Priti","Chimu");	
	// student.forEach(x -> System.out.println(x));  // lambda convert to method Reference 
     student.forEach(MethodSimpleProgram::Print);
    int a=5, b= 6;
    // it use consumer 
   BiConsumer<Integer,Integer> adder = MethodSimpleProgram::addNumber;
   adder.accept(a, b);
	}
	public static void addNumber(int a, int b) {
		System.out.println(a+b);
	}


}
