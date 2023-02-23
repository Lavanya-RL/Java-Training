package exceptionhandling8;

import java.util.Scanner;

public class Numberformat{
     
public static void main(String[] args)throws Exception {
	int [] sub=new int[10];
	 Average1 aver=new Average1();
	int n=10,avg=0,i=0;
	int c=n-sub.length;
	
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the marks:");

while(i<n) { 
			
		 try {
			  sub[i]=scanner.nextInt();
			 
			  i++;
			 
			  	} 
		 catch(Exception e) {
			 
			 //e.printStackTrace();
			System.out.println("Enter valid number");
			 scanner.next();
		continue;
			
			
			 
			
}
		
	
}
aver.average(sub);	 
}
	     
		 
	 
	 }



