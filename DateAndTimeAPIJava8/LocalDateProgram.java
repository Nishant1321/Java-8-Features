package DateAndTimeAPIJava8;
import java.time.LocalDate;
import java.time.Month;
public class LocalDateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate now=LocalDate.now();  //Current date
System.out.println(now);
LocalDate CustomDate=LocalDate.of(2002,8, 13);     // Create Custom Date

int day=now.getDayOfMonth();
Month month =now.getMonth();
int year = now.getYear();

System.out.println("Day :"+day);
System.out.println("Month :"+month);
System.out.println("year :"+year);

LocalDate YesterDate = now.minusDays(1);
System.out.println(YesterDate);
LocalDate pastDate =now.minusMonths(10);
System.out.println(pastDate);

if(now.isAfter(YesterDate)) {
	System.out.println("Nishant");
}

	}

}
