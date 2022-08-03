package com.thecodingzoo.lessons.basic;
public class Car2 {

	public static void main(String[] args) {
		
		
		Car x = new Car(2002,"Chevy Malibu");
		
		FuelGuage fg = new FuelGuage();
		
		Odometer  om = new Odometer();
		
		        //filling up car
			
			  FuelGuage.fuelingCar();
			
			  FuelGuage.runningCar();
			 
		      x.accelerate();
		       
		      Car.brakes();
		      
		      System.out.println(Odometer.mileageIncrem());
		      
		      FuelGuage.dashboardFuel();
		     
		      System.out.println(fg.currentFuel);
	      	
		 }
		
	}
class Car {

private int yearmodel;

private String specificMake;

public static int currentSpeed;

public Car(int x , String y ){
	
	        yearmodel  = x;
	        
	        specificMake = y;
	        
	        currentSpeed = 0;
}

int accessYearModel(){
	
	return yearmodel;
	
}
String accessspecificMake(){
	
	return specificMake;
	
}
int accesscurrentSpeed(){
	
	return currentSpeed;
	
}

void accelerate(){
	
	currentSpeed += 5;
	
}

static void brakes(){
	
	currentSpeed -= 5;
	
	FuelGuage.currentFuel -= (double)1;
}

}
class FuelGuage extends Car {
	
	public static Double currentFuel;

	public FuelGuage(){
		super(2016,Odometer.chevy);
		
	}

	public double currentFuel(double x){ 
	
	 return currentFuel = x;
	
}

	public static void dashboardFuel(){
	
	System.out.println("Your Chevy Malibu has " + currentFuel + " gallons of fuel left");
}

	public static Double fuelingCar(){ 
	
	for(int i = 0;i <= 15;i++){
		
		currentFuel = (double) i;
		
	}
	return currentFuel;

}

	public static void runningCar(){ 
	
		double x = Math.random();
	
     if (currentFuel > 0){
    	 
    	 Double i= currentFuel;
    	 
    	 while(i>0){
    		 
    		 currentFuel -= 1 - x;
    		 
    	}
		
	}
   }
  }
class Odometer extends Car {
	
	public static Double currentMileage;
	
	static String chevy = "chevyMalibu";

	public Odometer(){
		
		super(2016,chevy);
	}

	public static void currentMileage(double x){ 
		
		currentMileage = x;
		
	}

	public static void odometerViewer(){
		
    System.out.println("Your Chevy Malibu has a Mileage of " + currentMileage + " miles driven");
    
	}

	public static Double mileageIncrem(){ 
		
	for(int i = 0;i <= 999999;i++){
			
	currentMileage = (double) i;
			
	if (currentMileage == 999999) {
				
	currentMileage = (double) 0;
				
				
			}
		}
	return currentMileage;

	}

	public static void fuelGaugeDec(FuelGuage x){ 
		  	  
    double objectfuel = x.currentFuel( FuelGuage.currentFuel);
		
	    		 
    if (currentMileage%24 == 0){
   
	objectfuel-= 1;
	   
	   }
	    		 
	  }
			
    }
	   
	  
			
	
		
	
	
	
	
	
	
	
	

