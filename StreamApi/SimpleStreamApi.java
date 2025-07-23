package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> name = Arrays.asList("Nishant","Priti","Chimu");
System.out.println(name.stream().count());

//Declare The List How to Convert Stream
List<String> list = Arrays.asList("Apple","Banana","Grep");
Stream<String>listStream=list.stream();

//Arrays convert Stream
String[] a= {"Nishant","Priti","Chimu"};
 Stream<String>arrysStream=Arrays.stream(a);
 
 //direct Assign 
 Stream<Integer> IntegerStream=Stream.of(1,2,3,4);
 
//using iterate when consist urenaryOperator means apply Function
 Stream<Integer>limit=Stream.iterate(0, n->n+1).limit(100);
 
 //using generate when the use supplier 
 Stream<String>generate =Stream.generate(()->"Nishant").limit(5);

	}

}
