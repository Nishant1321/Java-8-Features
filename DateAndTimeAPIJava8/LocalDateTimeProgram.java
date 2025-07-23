package DateAndTimeAPIJava8;
import java.time.LocalDateTime;
public class LocalDateTimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime now = LocalDateTime.now();
System.out.println(now);
LocalDateTime parse = LocalDateTime.parse("2025-07-18T17:44");
System.out.println(parse.getDayOfMonth());
//same as the previous  Program 

	}

}
