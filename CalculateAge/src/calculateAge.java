import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calculateAge {

	public static void main(String[] args) throws ParseException {
		
		Calendar todayCalendar = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		Date dob = dateFormat.parse("06/07/1992");
		
		Calendar dobCalendar = Calendar.getInstance();
		
		dobCalendar.setTime(dob);
		
		int age = todayCalendar.get(Calendar.YEAR)-dobCalendar.get(Calendar.YEAR);
		
		int months = todayCalendar.get(Calendar.MONTH)-dobCalendar.get(Calendar.MONTH);
		
		int day = todayCalendar.get(Calendar.DAY_OF_MONTH)-dobCalendar.get(Calendar.DAY_OF_MONTH);
		
		if(months<0)
		{
			age--;
			months=todayCalendar.get(Calendar.MONTH)+1;
			day = todayCalendar.get(Calendar.DAY_OF_MONTH);
		
		}
		else if(months==0)
		{
			if(day<0)
			{
				age=age-1;
				months = todayCalendar.get(Calendar.MONTH) + 1;
				day = todayCalendar.get(Calendar.DAY_OF_MONTH);
			}
			else if(day==0)
			{
				
				System.out.println("Hurray!!! Its your BirthDay");
				day=0;
			}
			else
			{
				months=0;
				day=Math.abs(dobCalendar.get(Calendar.DAY_OF_MONTH)-todayCalendar.get(Calendar.DAY_OF_MONTH));			
			}	
		}
		else
		{
			if(day<0)
			{
				day=Math.abs(dobCalendar.get(Calendar.DAY_OF_MONTH)-todayCalendar.get(Calendar.DAY_OF_MONTH));			

			}
			
		}
		System.out.println("Person Age is " + age +" years " + months + " months "  + day +" days ");

	}

}
