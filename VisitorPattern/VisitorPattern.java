package VisitorPattern;
import java.util.Scanner;
public class VisitorPattern {
	public static void main(String[] args)throws DogExceptions {
				
				Child baby=new Child();
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter  item...:");
				String item=scan.next();
				Dog tiger=new Dog();
				baby.playWithDog(tiger, item);
			}
		}
class Child{
   public void playWithDog(Dog dog,String item) {
				try {
					dog.play(item);
				}catch(DogExceptions dee) {
					//dee.printStackTrace();
					dee.visit();
				}
				}
		}
class Dog{
	public void play(String item)throws DogExceptions {
		if(item.equals("stick")) {
			throw new DogBiteException("you beat I bite....");
				}
				}
		}
abstract class Handler911{
	public abstract void handle(DogBiteException dbe);
			
		}
class Handler911Impl extends Handler911{
     public void handle(DogBiteException dbe) {
       System.out.println("take him to hospital........");
			}
			}
abstract class DogExceptions extends Exception{
	public abstract void visit();
		}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
				this.msg=msg;
			}
	@Override
	public String toString() {
			return msg;
			}	
	@Override
	public void visit() {
		Handler911 dbh=new Handler911Impl();
		dbh.handle(this);
			}
		}
		

