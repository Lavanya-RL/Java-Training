package exceptionhandling5;

import java.util.Scanner;

public class Nocatch {
public static void main(String[] args) {
	Scanner Scanner =new Scanner(System.in);
	try {
		Human.behave("love");
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
/// error is shown as
// insert "Finally" to complete TryStatement//