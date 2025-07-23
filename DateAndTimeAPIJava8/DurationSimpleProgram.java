package DateAndTimeAPIJava8;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Instant  start = Instant.now();
  
  //Instant   end =  Instant.now();// if there are no work between the two instant then it return 0.001 millisecond
  int sum =0;
  for(int i =0;i<10000000;i++) {
	  sum += i;
  }
  Instant end =Instant.now(); // after work it showing millisecond
  Duration d1 = Duration.between(start, end);
  Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
  
  System.out.println(d1);
  System.out.println(d2);
  int i = d1.compareTo(d2);
  System.out.println(i);
  int z = d2.compareTo(d1);
  System.out.println(z);
  int a= d1.compareTo(d1);
  System.out.println(a);
  
	}

}

