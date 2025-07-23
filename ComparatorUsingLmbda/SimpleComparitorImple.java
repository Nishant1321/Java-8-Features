package ComparatorUsingLmbda;

import java.util.Comparator;

public class SimpleComparitorImple implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		
		return b-a;
	}

}
