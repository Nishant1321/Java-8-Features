package CreateThreadUsingLambdaExpression;

public class LmbdaSimple implements Runnable {

	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Hello"+ i);
		}
		
	}

}
