package day3;
import java.util.*;
interface stacks{
	public  void push(Stack<Integer> stack);
    

	public void stack_pop(Stack<Integer> stack);
    
}
	class Fixedstack implements stacks{
		

		@Override
		public void push(Stack<Integer> stack) {
			// TO{
	        for(int i = 0; i < 5; i++)
	        {
	            stack.push(i);
	        }
			
		}

		@Override
		public void stack_pop(Stack<Integer> stack) {
			for(int i = 0; i < 5; i++)
	        {
	            Integer y = (Integer) stack.pop();
	            System.out.println("Static stack"+y);
	        }
			
		}
				
	}
	class Dynamicstack implements stacks{
		int stacksize=5;
	public void push(Stack<Integer> stack) {
	// TODO Auto-generated method stub
	 for(int i = 6; i < 10; i++)
     {
         stack.push(i);
		 if(stack.size()<stacksize) {
	     stacksize=stacksize*2;
	     System.out.println(stack.size());
	     stack.push(i);
     } 
     }
	
}

@Override
public void stack_pop(Stack<Integer> stack) {
	// TODO Auto-generated method stub
	
	for(int i = 0; i < 5; i++)
    {
        Integer y = (Integer) stack.pop();
        System.out.println("Dynamic stack"+y);
    }
}
	}
public class exxcercise3 {
	    
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Fixedstack fs=new Fixedstack();
		Dynamicstack ds=new Dynamicstack();
		fs.push(stack);
		fs.stack_pop(stack);
		ds.push(stack);
		ds.stack_pop(stack);
		
		
		
	}
}


