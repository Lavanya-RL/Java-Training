package exceptionhandling9;
abstract class  ErrorException extends Exception{
	public abstract void Handlingmessage();
}

public class NegativeException extends ErrorException {
    String msg;
    public NegativeException(String msg) {
    	this.msg=msg;
    	
    }
    public String toString() {
		return msg;	
		
}
    public void Handlingmessage() {
    	System.out.println("Enter only values +ve");
    }
}
 class RangeException extends ErrorException {
    String msg;
    public RangeException(String msg) {
    	this.msg=msg;
    	
    }
    public String toString() {
		return msg;	
		
}
    public void Handlingmessage() {
    	System.out.println("Enter only values between 0-100");
    }
}