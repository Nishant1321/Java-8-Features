package StaticMethodInsideInterface;

 interface A{
	public static void sayhello() {
		System.out.println("Hello");
	}
	
}

public class Myclass implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass mc = new Myclass();
		//mc.sayhello();    we cant access static in that way
 	//	Myclass.sayhello();
		A.sayhello();
	}

}
