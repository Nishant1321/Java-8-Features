package Consumer;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerSecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer <List<Integer>> list1 = li ->{
	for(Integer i :li) {
		System.out.println(i);
	}
}; 
Consumer<List<Integer>>list2 = li ->{
	for(Integer i :li) {
		System.out.println(i+100);
	}
};
// using one default method which is andthen
list2.andThen(list1).accept(Arrays.asList(1,2,3,4));
	}

}
