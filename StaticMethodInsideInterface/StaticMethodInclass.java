package StaticMethodInsideInterface;

  interface C{
	  public static void sayhello() {
		  System.out.println("Hello");
	  }
  }

public class StaticMethodInclass implements C{
public static void sayhello() {
	System.out.println("Hello !");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodInclass.sayhello();
		C.sayhello();
	}

}
