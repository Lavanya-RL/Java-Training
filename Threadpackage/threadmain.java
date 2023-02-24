package Threadpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadmain {
	public static void main(String[] args) {
		StringBuffer stringbuffer=new StringBuffer("A");
		Threadclass  thread1=new Threadclass(stringbuffer);
		Threadclass   thread2=new Threadclass(stringbuffer);
		Threadclass  thread3=new Threadclass(stringbuffer);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
