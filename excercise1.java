package day2;

public class excercise1 {
	int a=10;
	void call(int a) {
	 a=a+10;
	}
	void callref(excercise1 eg) {
		eg.a=eg.a +10;
	}
	public static void main(String[] args) {
		excercise1 ex=new excercise1();
		
		ex.call(10);
		System.out.println("after pass by value"+ex.a);
         ex.callref(ex);
         System.out.println("after pass by reference"+ex.a);
}
}
