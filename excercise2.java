package day2;

public class excercise2 {
	int a=10;
	int b=100;
	int c;
      void call(excercise2 eg) {
    	   eg.c=eg.a+eg.b;
      }
      public static void main(String[] args) {
		excercise2 ex=new excercise2();
		ex.call(ex);
		System.out.println("sum after addtion "+ex.c);
	}
}
