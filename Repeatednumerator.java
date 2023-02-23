package exceptionhandling7;
import java.util.Scanner;
public class Repeatednumerator {
public static void main(String[] args) throws Exception {
	int numerator,denominator;
	Division division=new Division();
	while(true) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numerator");
		 numerator=scanner.nextInt();
		System.out.println("Enter denominator");
		 denominator=scanner.nextInt();
		division.checkcharacter(numerator);
		division.result(numerator,denominator);
		}
	
	
}
}
class Division  {
	public void checkcharacter(int numerator) {
          String   numerator1=String.valueOf(numerator);
         char str= numerator1.charAt(0);
         if((str=='q') ||(str=='Q')) {
              System.exit(0); 
         }
         
	}
	public void  result(int numerator,int denominator) throws Exception{
		try {
			int resultdiv;
			resultdiv= numerator/denominator;
			System.out.println("The result is"+resultdiv);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}


