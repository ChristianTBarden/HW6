public class Month {
	
	 //declared variables/Field
	
	private int monthNumber;
	//Month constructor with no value in argument, but initialize monthNumber to zero(0);
	public Month(){
		
		monthNumber = 1;
		
	}
	//A constructor that accepts the number of the month as an argument. It should set the monthNumber
	//field to the value passed as the argument. If a value less than 1 or greater than 12 is passed, the
	//constructor should set monthNumber to 1 and throw the appropriate exception using a custom
	//exception class.
	public Month(int numberOfMonth)throws Exception{
		
	if (numberOfMonth < 1 || numberOfMonth > 12){
		
		monthNumber = 1;}	
		
	}
	//A constructor that accepts the name of the month, such as “January” or “February” as an argument. It
	//should set the monthNumber field to the correct corresponding value. Throw an exception when an
	//invalid string is given for the name of the month using a custom exception class.
	public Month(String month)throws Exception{
		
		switch(month) {
		
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		
		}
		
	}	
	//A setMonthNumber method that accepts an int argument, which is assigned to the monthNumber
	//field. If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1.	
	void setMonthNumber(int x){
	
		monthNumber = x;
		
		if (monthNumber < 1 || monthNumber > 12){
			
			monthNumber = 1;}	
		
	}	
	//A getMonthNumber method that returns the value in the monthNumber field.	
	int getMonthNumber(){
		
		return monthNumber;
	} 	
	//A getMonthName method that returns the name of the month. For example, if the monthNumber field
	//contains 1, then this method should return “January”. This method should use a switch statement to
	//match monthNumber to monthName.'	
	static String getMonthName(int x){
		
		String z = null;
		
	switch(x) {
		
		case 1:
			return  z = "january";
			
		case 2:
			return z = "february";
			
		case 3:
			return z = "march";
			
		case 4:
			return z = "april";
		
		case 5:
			return z = "may";
		
		case 6:
			return z = "june";
			
		case 7:
			return z = "july";
			
		case 8:
			return z = "august";
		
		case 9:
			return z = "september";
			
		case 10:
			return z = "october";
			
		case 11:
			return z = "november";
			
		case 12:
             return z = "december";
             }
	
	return z;	
		
	}
	//A toString method that returns the same value as the getMonthName method.
	static String toString(int x ) {
		
		String z = "";
		
		switch(x) {
			
			case 1:
				return z = "january";
				
			case 2:
				return z = "february";
				
			case 3:
				return z = "march";
				
			case 4:
				return z = "april";
			
			case 5:
				return z = "may";
			
			case 6:
				return z = "june";
				
			case 7:
				return z = "july";
				
			case 8:
				return z = "august";
			
			case 9:
				return z = "september";
				
			case 10:
				return z="october";
				
			case 11:
				return z = "november";
				
			case 12:
	             return z = "december";
	             }
		
		return z;	
		
	} 
	//An equals method that accepts a Month object as an argument. If the argument object holds the same
	//data as the calling object, this method should return true. Otherwise, it should return false.
	public boolean equals(Month x ){
		
 
	    if(x.getMonthNumber() == getMonthNumber()){ return true;}
	    else {
		
		
		return false;}
		
	}
	
}
