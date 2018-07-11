import java.util.*;
import java.time.*;
import java.time.format.*;
public class Q1
{
    public static void main(String[] args) 
    {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter date in dd-Mon-yyyy format");
	String str=s.next();
	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate d=LocalDate.parse(str,f);
        DayOfWeek st=d.getDayOfWeek();
        System.out.println("Day is "+String.valueOf(st));
    }
}
