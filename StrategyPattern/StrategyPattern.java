package StrategyPattern;
public class StrategyPattern {
	public static void main(String[] args) {
		BadDog devil=new BadDog();
		
		//devil.play("stick");
		GoodDog ng=new  GoodDog();
		ng.gm= new Stone();
		ng.play();
		
	}
}


		



