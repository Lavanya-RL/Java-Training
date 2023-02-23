package exceptionhandling1;

package exceptionhandling;
import java.io.IOException;
import java.util.*;
public class Ioexception {
     public static void main(String[] args) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Please enter  item...:");
			String type=scanner.next();
		
	}
}
class Tree{
public void Branch(String type) {
	if(type.equals("soft")) {
		throw  new IOException("Do not type soft");
		
	}
	// error should add throw declaration 
}
}