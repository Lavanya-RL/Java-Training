package exercise;
import java.util.Scanner;

public class exercise16 {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i]) {
				System.out.println("present");
				System.out.println(i+"index");
				c=c+1;
				System.out.println(c+"count");
			}
		}
		
	}
}
	
	


