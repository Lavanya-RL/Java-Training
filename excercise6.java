package exercise;
import java.util.Scanner;

public class excercise6 {
	static void average(int n)
	{
		int avg=0,i;
		for(i=1;i<=n;i++) {
			avg=avg+i;
			
		}
		System.out.println("average" +avg/n);
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		n=sc.nextInt();
		average(n);
			}

}
