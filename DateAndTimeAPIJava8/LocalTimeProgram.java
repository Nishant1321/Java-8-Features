package DateAndTimeAPIJava8;

import java.time.LocalTime;

public class LocalTimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalTime now =LocalTime.now();
System.out.println(now);

LocalTime customeTime =LocalTime.of(14, 13);
System.out.println(customeTime);

int hour=now.getHour();
int minute=now.getMinute();
int second=now.getSecond();
System.out.println(hour);
System.out.println(minute);
System.out.println(second);

LocalTime pastHour=now.minusHours(1);
System.out.println(pastHour);

if(now.isAfter(pastHour)) {
	System.out.println("Yess");
}
LocalTime parsedTime =LocalTime.parse("15:30:45");  //parse use for different operation performed in given input
int hourparse=parsedTime.getHour();
System.out.println(hourparse);
	}

}
