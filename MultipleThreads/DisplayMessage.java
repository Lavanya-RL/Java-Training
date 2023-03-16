package MultipleThreads;

import java.util.Scanner;

public class DisplayMessage {
       synchronized public void displaymsg()  {
    	   System.out.println("Enter message:");
    	  Scanner scanner=new Scanner(System.in);
    	  String value=scanner.nextLine();
    	  System.out.println("-------"+value+"-------");
    	  
}
}
