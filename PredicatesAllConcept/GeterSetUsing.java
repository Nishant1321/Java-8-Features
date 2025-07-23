package PredicatesAllConcept;

import java.util.function.Predicate;

public class GeterSetUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    a bc =new a(1 ,"Nishant");
    a bc1 = new a(2,"Vishal");
    
    Predicate <a> abc = x -> x.getId() >1;
    System.out.println(abc.test(bc1));
    
	}
	private static class a{
		int id;
		String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public a(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
	}

}
