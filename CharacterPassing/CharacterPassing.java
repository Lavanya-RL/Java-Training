package CharacterPassing;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterPassing  {
	static int count=0;
	public static void main(String[] args)throws Exception   {
		while(true) {	
			System.out.println("Enter value:");
		Scanner scanner=new Scanner(System.in);
		char value=scanner.next().charAt(0);
		countLetter(value);
				
		}
		}
	public static  void countLetter(char c) throws Exception{
    	if(Character.isLetter(c)) {
    		count++;
    		System.out.println(count);
    		
    	}else {
    		throw new Exception(c+"is not letter");
    		
    	}
}
}
