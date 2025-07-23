package Consumer;
import java.util.*;
import java.util.function.Consumer;

public class SimpleConsumerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it can be used if only use the value 
	Consumer<String> name = s -> System.out.println(s);
	name.accept("Nishant");
	
	Consumer <List<Integer>> number = li ->{
		for(Integer  i :li) {
			System.out.println(i+100);
		}
		
	};
	number.accept(Arrays.asList(1,2,3,4));
	}

}
