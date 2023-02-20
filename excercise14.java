package day2;

public class excercise14 {
 public static void main(String[] args) {
	 result obj=new result();
	 obj.totalmarkcalc(80,90,95);
	 
	
}
}
class Student{
	String name;
	int rolllno;
}
class exam extends Student{
	int sub1;
	int sub2;
	int sub3;
}
class result extends exam{
	int totalmark;
	void totalmarkcalc(int sub1,int sub2,int sub3) {
		totalmark=sub1+sub2+sub3;
		System.out.println("total mark is"+totalmark);
	}
}
