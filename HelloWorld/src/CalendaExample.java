import java.util.Calendar;

public class CalendaExample {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println("년" + cal.get(Calendar.YEAR));
		System.out.println("월" + cal.get(Calendar.MONTH));
		System.out.println("요일" + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("====================================");
		
		cal.set(2019, 0, 1);
		System.out.println("년" + cal.get(Calendar.YEAR));
		System.out.println("월" + cal.get(Calendar.MONTH));
		System.out.println("요일" + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("전체일수" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		cal.set(2019, 2);
		System.out.println("년" + cal.get(Calendar.YEAR));
		
		
		
	}

}
