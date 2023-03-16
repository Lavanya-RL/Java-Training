package CharacterPassing;

import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterPassing  {
	
	public static void main(String[] args)throws Exception   {
		while(true) {	
			System.out.println("Enter value:");
		Scanner scanner=new Scanner(System.in);
		String value=scanner.nextLine();
		countLetter(value);
				
		}
	}
	
 public static  void countLetter(String c) throws NonalphabeticException {
	//boolean result=false;
	int n=c.length();
	//int res=0;
	int count=0;
		for(int i=0;i<n;i++) {
			// System.out.println(n);
		try {
			 if(Character.isLetter(c.charAt(i))) {
	    		count++;
	    		
	    		}
			 else {
				 throw new NonalphabeticException();
			 }
		}catch(NonalphabeticException e) {
			System.out.println(e);
			continue;
		}
			 
			 }
		System.out.println(count);
			 
			
			 }
		
		
		 
		
 }



 
		 


	

