import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
	
	public static void main(String args[]) {
		
		LocalDate localDate1 = LocalDate.of(2016, 06, 16);
		LocalDate localDate2 = LocalDate.of(2017, 10, 15);
		Period period = Period.between(localDate1, localDate2);
		System.out.println("Years (" + period.getYears() +"),Months(" + period.getMonths() +"), Days(" + period.getDays() + ")");
	}

}
