package exercise;
import java.util.Arrays;
import java.util.ArrayList;


public class excercise5 {
	public static void func2(Integer arr[])
    {
        
        ArrayList<Integer> array_list = 
            new ArrayList<Integer>(Arrays.asList(arr));
        System.out.print(array_list);
        array_list.add(3);
        System.out.print(array_list);
    }
	public static void main(String[] args) {
		Integer arr[]= {new Integer(1),new Integer(2)};
		
		func2(arr);
		
		
		
		
	}

}
