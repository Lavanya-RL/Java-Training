package MultipleThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultipleThread {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(3);
	DisplayMessage displaymessage=new DisplayMessage();
	executor.execute(()->{
		
		displaymessage.displaymsg();
		
	});
executor.execute(()->{
		
		displaymessage.displayThankyou();
		
	});
executor.execute(()->{
	
	displaymessage.displayNiceDa();
	
});

}
}
