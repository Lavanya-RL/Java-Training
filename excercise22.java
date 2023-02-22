package exercise;

public class excercise22 {
	public class students{

	
		private int id;
		protected String name;
		
		 public void students(String name,int id) {
			this.name=name;
			this.id=id;
			
		}
		void details() {
			System.out.println("studetsn details"+name+"identity"+id);
		}
	}
	
	public static void main(String[] args) {
		students std=new students ("lava",1234);
		std.details();
		
		
	
		
	}
	
}
/// error occccurs "Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//The constructor excercise18.students(String, int) is undefined

	//at exercise.excercise18.main(excercise18.java:21)
//"