package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,44,55,21,23,25,2,1,3);
// filter when use predicates 
List<Integer> filterList =list.stream().filter(x -> x % 2==0).collect(Collectors.toList());
System.out.println(filterList);
//map when use function
List <Integer> mappedList= filterList.stream().map(x ->x/2).collect(Collectors.toList()) ;
System.out.println(mappedList);

// combine two 
List<Integer>CombineList=list.stream().
filter(x->x%2==0).                                       //Predicates use for filter element
map(x->x/2).                                             // map use for the divide the filter element              
distinct().                                              // remove the duplicate
sorted((a,b) -> (b-a)).                                  // sorting element descending order
skip(2).                                                 // Skip the start element
collect(Collectors.toList());                            // convert to string
System.out.println(CombineList);

List<Integer> collect = Stream.iterate(0, x ->x+1).
limit(101).
skip(1).
filter(x ->x % 2==0).
map(x->x/10).
sorted().
distinct().
peek(x -> System.out.println(x)).                       //Consumer View the Photography               
collect(Collectors.toList());


Integer collection=Stream.iterate(0,x ->x+1).
limit(101).
map(x->x/20).
distinct().
peek(System.out::println).
max((a,b)->a-b).                                            // Max And Min operation
get();                                                       // get for opetional value 
System.out.println(collection);    

		
		// terminal operations
Long operation = Stream.iterate(0, x->x+1).limit(101).map(x->x/20).distinct().skip(1).count();
System.out.println(operation);

	}

	

}
  