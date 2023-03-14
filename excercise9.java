package day2;
 class A {
    public  int hrs=10;
    private int num;
    protected int id;
    public void method1() {
    	
    	
    }
}
 class b extends A{
	 void sal() {
	
	int salary=hrs*id;
	System.out.println(salary);
}}
public class excercise9{
	public static void main(String[] args) {
		b obj=new b();
		 obj.sal();
		
	}
}
// cnnot acces privatre ,but can acess public and protected in the same 
//package