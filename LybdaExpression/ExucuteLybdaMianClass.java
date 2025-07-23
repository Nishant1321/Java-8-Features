package LybdaExpression;

public class ExucuteLybdaMianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe emp = () -> "Nishant Ingawale" ;{
			System.out.println(emp.getName());
			
			
		}
		
		Employe emp1 = () -> "Nishant" ;{
			System.out.println(emp1.getName());
			
			
		}
	}

}
