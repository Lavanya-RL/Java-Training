package exceptionhandling5;
import java.util.Scanner;
public class Nocatch {
public static void main(String[] args) throws StringException {
	
	try {
		throw new StringException("string is printed");
	}
	finally {
		
	}
	
	
}
}
class StringException extends Exception{
	public StringException(String s) {
		System.out.println("String only");
		
	}
}

/// error is shown as
// insert "Finally" to complete TryStatement//