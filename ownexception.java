package exceptionhandling4;
import java.util.Scanner;
public class ownexception {
public static void main(String[] args)  {
	
	try {
		throw new StringException("string is printed");
	}
	catch(StringException e) {
		System.out.println("Not a string");
		System.out.println(e.getMessage());
		
	}
	
}
}
class StringException extends Exception{
	public StringException(String s) {
		System.out.println("String only");
		
	}
}