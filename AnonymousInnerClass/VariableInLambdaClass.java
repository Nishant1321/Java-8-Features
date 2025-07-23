package AnonymousInnerClass;

public class VariableInLambdaClass {
	int a= 5;
	private void DoSomeThing() {
		
		Employee Employee =() ->{
		//	a=3; // it cant Be change Becouse it must be final if use in lambda expression 
			System.out.println(this.a);
			return "100";
			
		};
		System.out.println(Employee.getSalary());
	}
	Employee emp1 = new Employee() {
int a=15;
		@Override
		public String getSalary() {
			int a= 5; //local variable
			// TODO Auto-generated method stub
			System.out.println(this.a);
			return "200";
		}
		
	};

}
