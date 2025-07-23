package FunctionalInterface;

public interface DefaultMethodInInterface {
	default void SayHello() {
		System.out.println("hello");
	}
	

}
 class child implements DefaultMethodInInterface {
	
}
 class myclass{
	 public static void main(String[] args) {
		 child c = new child();
		 c.SayHello();
	 }
 }
