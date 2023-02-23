package ExceptionHandling6;

public class DerivedclassException {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  item...:");
		String name=scan.next();
		try {
			Child child =new Child("hari");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
}
