package DigitalClock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(1);
	DisplayTime displaytime=new DisplayTime();
	executor.execute(()->{
		displaytime.displayingTime();
		
	});
}
}
