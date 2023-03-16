package Threadpackage;

 class Threadclass extends Thread {
	 
 StringBuffer stringbuffer;

	public Threadclass(StringBuffer stringbuffer) {
		this.stringbuffer=stringbuffer;
	}
	
	

	synchronized  public void run() {
		synchronized(stringbuffer) {
		
		int i=0;
		
		
		 while(i<100) {
			 System.out.println(stringbuffer);
			  i++;
			  }
			  
		 try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {}
		 char b=(char) (stringbuffer.charAt(0)+1);
			stringbuffer.setCharAt(0,b);
			
			
		}		
	 
	}
     
}
 
