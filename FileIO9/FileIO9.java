package FileIO9;

import java.util.Scanner;

public class FileIO9 {
public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner scanner=new Scanner(System.in);
	String input=scanner.nextLine();
    if(input==null) {
		System.out.println("No input Given");
	}
    String [] words=input.split("\\s+");
    System.out.println(words.length);
    }
	
}

