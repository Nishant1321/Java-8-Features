package ComparatorUsingLmbda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleComparitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Integer> list = new ArrayList<>();
list.add(1);
list.add(3);
list.add(5);
list.add(6);
Collections.sort(list, new SimpleComparitorImple());
System.out.println(list);
	}

}
