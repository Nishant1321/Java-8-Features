package CreateThreadUsingLambdaExpression;

public class OutPutOfLambdaSimpel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LmbdaSimple sc = new LmbdaSimple();
		Thread th = new Thread(sc);
		th.run();

	}

}
