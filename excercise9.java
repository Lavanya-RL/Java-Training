package exercise;

import java.util.Arrays;
import java.util.Collections;

public class excercise9 {
   static void reversearray(Integer arr[]) {
	   Collections.reverse(Arrays.asList(arr));
	   
	   System.out.println("reverse"+Arrays.asList(arr));
	  }
   public static void main(String[] args) {
	   Integer[] ar= {1,2,3,4};
	   reversearray(ar);
	
}
}
