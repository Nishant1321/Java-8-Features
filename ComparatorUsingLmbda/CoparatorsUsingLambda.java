package ComparatorUsingLmbda;
import java.util.*;
public class CoparatorsUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> li = new ArrayList<Integer>();
li.add(2);
li.add(4);
li.add(6);
li.add(8);
li.add(9);
Collections.sort(li, (a,b) -> b-a);
System.out.println(li);
	}

}
