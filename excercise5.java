package day2;

class objects {
	static int objnum=0;
	void inc() {
     objnum+=1;
	}
	public void test(){
		 objects obj1=new objects();
		 obj1.inc();
	}
	void methods() {
		
	}
}
public class excercise5{
	public static void main(String[] args) {
		objects obj=new objects();
		obj.test();
		obj.methods();
		System.out.println(obj.objnum);
		
	}
}

