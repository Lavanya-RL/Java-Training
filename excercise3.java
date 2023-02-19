package day2;

public class excercise3 {
	public static void main(String[] args) {
		payment p=new payment();
		p.emp=new Salesperson();
		p.Topay();
		payment p1=new payment();
		p1.Forjoin();
		
		
		 
		}
}
class payment{
	Employee emp;
	joindate d;
	public void Topay() {
		emp.pay();
		}
	public void Forjoin() {
		d.date(this);
	}
	
}
  abstract class Employee{
	public abstract void pay();
	
}
  abstract class joindate{
	  public abstract void date(payment date);
  }
class Salesperson extends Employee{
	class DateSp extends joindate{
		public void date(payment date)
		 {
			System.out.println("1.2.99");
		}
	}
	@Override
	public void pay() {
		int hours=200;
		int hrrate=10;
		System.out.println("Grosspay"+hours*hrrate);
		
		
	}
	
}
class worker extends Employee{
	class Datew extends joindate{
		public void date(payment date) {
			System.out.println("2.3.99");
		}
	}
	public void pay() {
		int hours=200;
		int hrrate=22;
		System.out.println("Grosspay"+hours*hrrate);
	}
		
	}
	

class Salesmanager extends Salesperson{
	class DateSm extends joindate{
		public void date(payment date) {
			System.out.println("2.3.99");
		}
	}
	
	@Override
	public void pay() {
		int hours=200;
		int hrrate=25;
		System.out.println("Grosspay"+hours*hrrate);
	}
	
}
class  SalesTm extends Salesmanager{
	class Datest extends joindate{
		public void date(payment date) {
			System.out.println("2.3.99");
		}
}
	@Override
	public void pay() {
		int hours=200;
		int hrrate=20;
		System.out.println("Grosspay"+hours*hrrate);
	}
		
	}
	
