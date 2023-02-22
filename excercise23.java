package exercise;


	class students{
		 protected int regno=1948;
		}
	class Details{
		students det=new students();
		  void printdetail() {
			System.out.println("regno is"+det.regno);
			
		}
	}
	public class excercise23 {
	
	public static void main(String[] args) {
		Details std=new Details();
		std.printdetail();
		}
}
	

