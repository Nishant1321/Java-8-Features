package DateAndTimeAPIJava8;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.*;
import java.util.Set;
public class ZonedDateTimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ZonedDateTime now = ZonedDateTime.now();
System.out.println(now);
Set<String> avilablezone =ZoneId.getAvailableZoneIds();
//avilablezone.forEach(System.out::println);
ZonedDateTime of =ZonedDateTime.of(2025,07, 19,14,30,34,30,ZoneId.of("America/Cuiaba"));
System.out.println(of);
ZonedDateTime Cuba = ZonedDateTime.now(ZoneId.of("Cuba"));
System.out.println(Cuba);



	}

}
