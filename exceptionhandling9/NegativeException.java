package exceptionhandling9;

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