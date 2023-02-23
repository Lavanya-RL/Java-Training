package exceptionhandling9;

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
