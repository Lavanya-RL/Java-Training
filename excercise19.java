package exercise;

import java.util.Scanner;

public class excercise19 {
	public static void main(String[] args) {
		int arr[][] = new int[10][10];
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter row for the array  : ");
	     int row = scan.nextInt();
	    System.out.print("Enter column for the array  : ");
	    int col = scan.nextInt();
      System.out.println("Enter  Array Elements : ");
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	          arr[i][j] = scan.nextInt();
	        }
	      }

				
		for(int i =0;i<arr.length;i++) 
		{
		  for(int j = arr[i].length-1;j>=0;j--)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}

}
