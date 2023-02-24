package CountingThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor=Executors.newFixedThreadPool(1);
		executor.execute(()->{
			int count=0;
			for(int i=0;i<100;i++) {
				count++;
				System.out.println(count);
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				if(count%10==0) {
					System.out.println(count+" after Numbers");
				}
			}
			
		});
	}
}
	
	   
