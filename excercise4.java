package exercise;
import java.util.Scanner;

public class excercise4 {
	public static void main(String[] args) {
		int input,b,c,flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		input=scan.nextInt();
		if(input==1) {
			System.out.println("not a prime ");
			
		}
		else if(input>1){
			for(int i=2;i<=input/2;i++) {
				if(input%i==0) {
					System.out.println("not prime");
					 flag =1;
					break;
					}
				}
			if(flag==0) {
				System.out.println("prime");
		}
			
		}
	}}
