package day2;

public class excercise1 {
	int a=10;
	void callbyvalue(int a) {
	 a=a+10;
	}
	void callbyreference(excercise1 eg) {
		eg.a=eg.a +10;
	}
	public static void main(String[] args) {
		excercise1 ex=new excercise1();
		
		ex.callbyvalue(10);
		System.out.println("after pass by value"+ex.a);
         ex.callbyreference(ex);
         System.out.println("after pass by reference"+ex.a);
}
}
