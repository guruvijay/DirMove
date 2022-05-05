package DirMove;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ldt.atZone(zoneId);
		System.out.println(zdt);
	}

}
