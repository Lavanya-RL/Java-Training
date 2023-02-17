package exercise;
import java.util.Scanner;

public class excercise8 {
public static void main(String[] args) {
	int[] arr= {1,4,5,23,78,30};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element:");
	int c =sc.nextInt();
	for(int i=0;i<=arr.length;i++) {
		if (arr[i]== c) {
			System.out.println("index"+i);
		}
		
	}
	
	
	
}
}
