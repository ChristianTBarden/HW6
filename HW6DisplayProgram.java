import java.util.Scanner;

public class HW6DisplayProgram {

	public static void main(String[] args) throws Exception {
		
		// declaring month and year as int
		int month,year;
		
		//Create scanner object
		Scanner sc = new Scanner(System.in);
		
		//prints user prompt
		System.out.print("Enter a month (1-12):");
		
		//// intitialize month to scanner int 
		month = sc.nextInt();
		
	    //prints user prompt
		System.out.print("Enter a year:");
		
		// intitialize year to scanner int
		year = sc.nextInt();
		
        //Create MonthDays Object
		MonthDays md = new MonthDays(month, year);
		
		//access month class and use toString method to produce month string based on int.
		String monthstr = Month.toString(month);
		
		//Print out formatted display----used method getNumberOfDays() in class MonthDays to find number of days depending on it being a leap year
		System.out.println(monthstr + " " + year  + " has " + md.getNumberOfDays(month,year) + " days");
		
		}}

		
	


