package oops;
import java.util.Scanner;
public class dogdemo {
	public static void main(String[] args){
			
			Goodfan leno=new Goodfan();
			
				
}
			
 			
		}
		
	}
class Goodfan {
	state st;
	public void pull() {
		st.comfort();
	}
}

abstract class state{
	
	public abstract void  comfort ();
}
class offstate extends state{
	public void comfort() {
		System.out.println("Switch on");
	}
}
class onstate extends state{
	public void  comfort() {
		System.out.println("low sppes");
	}
		
	}
class lowss extends state{
	public void comfort() {
		System.out.println("highsped");
	}
		
}


		
	


