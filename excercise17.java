package exercise;
import java.io.*;

	class stock {
		int val;
		  final static int b = 12;
		  static  int stockvalue=1;
		stock(int val){
			this.val=val;
		}
	}
	class stocks{
		static int stcvalue;
	     public void stockvalue(int val) {
	            stcvalue=val;
	            System.out.println(stcvalue+"stock value is");
	            
	            
	   }	}
	public class excercise17 {
		
		public static void main(String[] args) {
			stock obj=new stock(10);
			int c=10;
			stocks obj1=new stocks();
		    obj1.stockvalue(20);
			
		}
		
	}


