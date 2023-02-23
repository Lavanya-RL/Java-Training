package exceptionhandling;
import java.io.IOException;
import java.util.*;
public class Ioexception {
     public static void main(String[] args) throws Exception {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Please enter  item...:");
			String type=scanner.next();
			Tree tree=new Tree();
			tree.Branch(type);
		
	}
}
class Tree{
public void Branch(String type) throws Exception {
	System.out.println(tree);
}
}
	
		