package MultipleThreads;

public class DisplayMessage {
       synchronized public void displaymsg() {
    	   System.out.println("------Welcome------");
       
       //synchronized public void displayThankyou() {
    	   System.out.println("---Thankyou----");
       
      // synchronized public void displayNiceDay() {
    	   System.out.println("----Have a nice day----");
       }
}
