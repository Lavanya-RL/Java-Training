package CharacterPassing;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterPassing  {
	public static void main(String[] args)throws Exception   {
		while(true) {	
			System.out.println("Enter value:");
		Scanner scanner=new Scanner(System.in);
		char value=scanner.next().charAt(0);
		NotALetterException notaletter=new NotALetterException(null);
		NotALetterException.countLetter(value);
				
		}
		
			 
	        	
	         

			
        
}
}
