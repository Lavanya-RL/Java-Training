package day2;
class Singleton{
	private static Singleton instance=null;
	String s;
	public static  Singleton getinstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
		
	}
}

public class excercise8 {
public static void main(String[] args) {
	Singleton x=Singleton.getinstance();
	Singleton y=Singleton.getinstance();
	System.out.println("location x is"+x.hashCode());
	System.out.println("location y is"+y.hashCode());
	if (x==y) {
		System.out.println("only one instance created");
	}
	
	
}
}
