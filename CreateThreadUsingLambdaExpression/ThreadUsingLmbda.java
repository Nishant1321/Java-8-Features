package CreateThreadUsingLambdaExpression;

public class ThreadUsingLmbda {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable =() -> {
			for(int i =1;i<=10;i++) {
				System.out.println("hello "+i);
			}
		};
     Thread th = new Thread(runnable);
     th.run();
	}

}
