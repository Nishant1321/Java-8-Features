package DateAndTimeAPIJava8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodSimpleProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now();
		Thread.sleep(2000);
		LocalDateTime then = LocalDateTime.now();
		Duration d1 = Duration.between(now, then);
		System.out.println(d1);
		
		LocalDate a = LocalDate.now();
		LocalDate b = LocalDate.of(2000,7,5);
		Period duration = Period.between(a, b);
		System.out.println(duration);
		

	}

}
