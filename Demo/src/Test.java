import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		localDateParseDemo("26/12/2016 09:10:00");
	}
	
	public static void localDateParseDemo(String date)
    {
           LocalDate nowDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
           System.out.println("Entered date -: " + nowDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS")));
    }

}
