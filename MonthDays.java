
public class MonthDays extends Month {
	//use extends to make MonthDays a subclasss
	//created MonthDays constructor with a int month and int year argument
	//constructors are used to create new objects with parameters determining initial state
	
	public MonthDays(int month, int year) {

		}
	
	//static enables to use of a method without creating an object, but I made an object by choice
	//with this method it honestly would've been faster if I didn't make the object.Did it with Month
	//class though.
	
static int getNumberOfDays(int month, int year)throws Exception{
	
	//assign/initialize days to zero as a starting value that can be altered.
	
    int days = 0;
    
        //conditional that identifies leap year and corresponding days in specified month.
		if (year % 100 == 0 || year % 400 == 0) {
			
		switch (month) {
		
		case 1:
			return days = 31;
			
		case 2:
			return days = 29;
			
		case 3:
			return days = 31;
			
		case 4:
			return days = 30;
		
		case 5:
			return days = 31;
		
		case 6:
			return days = 30;
			
		case 7:
			return days = 31;
			
		case 8:
			return days = 31;
		
		case 9:
			return days = 30;
		
		case 10:
			return days = 31;
			
		case 11:
			return days = 30;
		
		case 12:
			return days = 31;
			}
		}
		//conditional that identifies leap year and corresponding days in specified month.
		else if(year % 100 == 0 || year % 4 == 0){ 
		switch (month) {
		
		case 1:
			return days = 31;
			
		case 2:
			return days = 29;
			
		case 3:
			return days = 31;
	
		case 4:
			return days = 30;
		
		case 5:
			return days = 31;
		
		case 6:
			return days = 30;
			
		case 7:
			return days = 31;
			
		case 8:
			return days = 31;
			
		case 9:
			return days = 30;
			
		case 10:
			return days = 31;
			
		case 11:
			return days = 30;
			
		case 12:
			return days = 31;
			
		}}//identifies normal days of specified month if not leap year.
		
		else {switch (month) {
		case 1:
			return days = 31;
			
		case 2:
			return days = 28;
			
		case 3:
			return days = 31;
		
		case 4:
			return days = 30;
		
		case 5:
			return days = 31;
		
		case 6:
			return days = 30;
			
		case 7:
			return days = 31;
		
		case 8:
			return days = 31;
		
		case 9:
			return days = 30;
			
		case 10:
			return days = 31;
		
		case 11:
			return days = 30;
			
		case 12:
			return days = 31;}
    }
		//returns the value of days based upon the year and month
		
		return days;}
    }