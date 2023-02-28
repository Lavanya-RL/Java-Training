package StrategyPattern;



public class StrategyPattern {
	public static void main(String[] args) {
		BadDog devil=new BadDog();
		
		devil.play("stick");
		GoodDog ng=new  GoodDog();
		ng.gm= new Stick();
		ng.play();
		
	}
}
class BadDog{
	public void play(String item) {
		if (item.equals("stick")) {
			System.out.println("YOu beat i bite");
		
		}
		if (item.equals("stone")) {
			System.out.println("you catch i throw");
		}
	}
	
	
}
class GoodDog{
	Game gm;
	public void play() {
		gm.cth();
	
}
}
abstract class  Game{
	public abstract void cth();
}
class Stick extends Game{
	@Override
	public void cth() {
		System.out.println("YOu beat i bite");
		}
}
class Stone extends Game{
	@Override
	public void cth() {
		System.out.println("you catch i throw");
				
	}
}
		



