package Singleton;

public class Canteen1 {
	
private Canteen1() {
		System.out.println("canteen object created...");
		}
	
	private static Canteen1 canteen;
	synchronized public static Canteen1 createInstance() {
		if(canteen==null) {
			canteen=new Canteen1();
			try {Thread.sleep(1000);}catch(Exception e) {}
			
			return canteen;
			
		}
		else {
			return canteen;
		}
	}
	public void met() {
		System.out.println("Second thread called");
		System.out.println("non static met called...");
	}
	public static void main(String[] args) {
		Canteen1 canteen1=Canteen1.createInstance();
		Canteen1 canteen2=Canteen1.createInstance();
		System.out.println(canteen1);
		System.out.println(canteen1);
		
	}
	}



