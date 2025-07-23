package AnonymousInnerClass;

public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClassInterface op = new AnonymousClassInterface() {

			@Override
			public String getSalary() {
				// TODO Auto-generated method stub
				return "100";
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Nishant";
			}
			
		};
		System.out.println("name : "+op.getName() +"\nsalary : "+ op.getSalary());
	
	}

}
