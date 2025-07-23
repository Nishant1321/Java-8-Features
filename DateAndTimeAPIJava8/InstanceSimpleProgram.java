package DateAndTimeAPIJava8;

import java.time.Instant;

public class InstanceSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// its gave  a date which is from 1 jan 1970 to current date and time.
		long currentTime =System.currentTimeMillis();
		System.out.println(currentTime);
		Instant now = Instant.now();
		System.out.println(now);
		
	}

}
