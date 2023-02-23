package exceptionhandling4;
import java.util.Scanner;
public class ownexception {
public static void main(String[] args) {
	Scanner Scanner =new Scanner(System.in);
	try {
		Human.behave("love");
	}
	catch(Exception e) {
		System.err.println(e);
	}
	
}
}
class Human{
	public static void behave(String item) throws Exception{
		if(item.equals("love")) {
			System.out.println("happy");
		}
		else {
			throw new Exception();
		}
	}
}