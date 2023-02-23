package exceptionhandling9;

import java.util.Scanner;

public class MoreExceptions {
	public static void main(String[] args) throws NegativeException,RangeException {
		int [] sub=new int[10];
		 Average aver=new Average();
		int i=0, n=10,avg=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks:");
		 while(i<10) { 
		 try {
			
			
					
				 
					  int val=scanner.nextInt();
					  
					  try {
						  if(val<0) throw new NegativeException("enter positive number");
						  if(val>100) throw new RangeException("enter within 100");
						  sub[i]=val;
						  i++;
					  } catch(Exception e) {
							 System.out.println(e);
							 //e.printStackTrace();
							 //scanner.next();
							 continue;

			}
					  	} 
				 catch(Exception e) {
					 System.out.println("Number format exception");
					 scanner.next();
					 //e.printStackTrace();
					 continue;

	}
				
					 
	}
		
		 aver.average(sub); 
		 
		 
	}
	}

