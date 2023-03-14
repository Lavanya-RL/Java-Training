package day2;

public class excercise14 {
 public static void main(String[] args) {
	 result obj=new result();
	 Student obj1=obj;
	 
	 obj.StudentDetails("lavanya",1234);
	 obj.totalmarkcalc(80,90,95);
	 
	
}
}
class Student{
	
	void StudentDetails(String name,int rollno) {
		System.out.println("name : "+name);
		System.out.println("regno :"+rollno);
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
