package exceptionhandling;

import java.util.Scanner;


class Man {
	
	public Man(String name) throws Exception{
		if(name.equals("Hari")) {
			throw new Exception("Name is invalid");
		}
	}
}
class Child extends Man{

	public Child(String name) throws Exception {
		 
	}

	public class DerivedclassException {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter  item...:");
			String name=scan.next();
			try {
				Child child =new Child("hari");
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
		}

	}
	// could not find mai class exception in derived class

	
}
