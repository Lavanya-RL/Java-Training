package exercise;

import java.util.Scanner;

public class excercise21 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int month,year;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
		month = sc.nextInt();
		System.out.println("enter year");
		year=sc.nextInt();
		
		switch(month)
		{
		  	case 1:
		  	case 3:
			case 5: 	
			case 7:
			case 8:
			case 10:
			case 12:			  	
				System.out.println("\n 31 Days in this Month");
			  	break;
			
			case 4:	
			case 6:
			case 9:
			case 11:			    	
				System.out.println("\n 30 Days in this Month");  
				break;
			
			case 2:
				System.out.println("\n Either 28 or 29 Days in this Month"); 
				if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
		         System.out.println("Specified year is a leap year");
				}
		      else {
		         System.out.println("Specified year is not a leap year");
		   }
				
			
			default:		  	
				System.out.println("\n Please enter Valid Number between 1 to 12");
		  }
		
	}
}
