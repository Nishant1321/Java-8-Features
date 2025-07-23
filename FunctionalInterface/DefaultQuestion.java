package FunctionalInterface;

public interface DefaultQuestion {

	default void sayHello() {
		System.out.println("hello a");
	}
	
}

interface DefaultQuestionB{
	default void sayHello() {
		System.out.println("hello b");
	}
}

class myclass1 implements DefaultQuestion,DefaultQuestionB {
	public static void main(String[] string) {
		myclass1 c = new myclass1();  
	c.sayHello();
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		DefaultQuestion.super.sayHello();
	}


}