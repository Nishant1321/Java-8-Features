package MethodOrConstructorRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> name =Arrays.asList("Nishant","priti","Chimu");
//lambda expression 
 //List<ConstructorRefrenceProgram> students =name.stream().map(x -> new ConstructorRefrenceProgram(x)).collect(Collectors.toList()); 
 //convert lambda to constructor reference 
 List<ConstructorRefrenceProgram>student=name.stream().map(ConstructorRefrenceProgram::new).collect(Collectors.toList());
	
	}

}

