package exercise;
import java.lang.Math;
import java.util.Scanner;
import java.lang.*;
public class exercise15b {
	static void armstrong(int n) {
	
		int num=String.valueOf(n).length();
		int temp=n,res=0;
		while(n>0) {
			int rem=n%10;
		   res+=Math.pow(rem,num );
			n=n/10;
		}
		if (res==temp) {
			System.out.println(temp+" armstrong number");
		}
		
	}
	static void perfect(int n) {
		int sum = 1;
		  for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i==0)
	        {
	            if(i * i != n)
	                sum = sum + i + n / i;
	            else
	                sum = sum + i;
	        }
	    }
	    
	    if (sum == n && n != 1) {
	        
	 System.out.println(n+" perfect number");
	}
	    
	}
	static void palindrome(int n) {
		String s=String.valueOf(n);
		StringBuffer rev=new StringBuffer(s);
		rev.reverse();
		String data=rev.toString();
		if(s.equals(data)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sc.close();
		armstrong(n);
		perfect(n);
		palindrome(n);
		
		
		
	}

}
