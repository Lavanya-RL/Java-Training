package ThreadOnceStarted;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadOncestarted {
public static void main(String[] args) {
	Thread thread=new Thread();
	thread.start();
	System.out.println("Thread started");
	thread.start();
	
	
	
}
}
