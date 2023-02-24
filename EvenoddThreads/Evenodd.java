package EvenoddThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Evenodd {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(2);
	DisplayEvenOdd displayEvenOdd=new DisplayEvenOdd();
	executor.execute(()->{
		Thread.currentThread().setName("Thread1");
		displayEvenOdd.DisplayEven();
		
	});
	executor.execute(()->{
		Thread.currentThread().setName("Thread2");
		displayEvenOdd.DisplayOdd();
		
	});
	
}
}
