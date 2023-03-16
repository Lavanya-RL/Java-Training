package ConsumerProducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducer {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(2);
	InventorySystem inventory=new InventorySystem();
	executor.execute(()->{
		for(int i=0;i<4;i++) {
			inventory.Consume();
		}
		
		
	});
	executor.execute(()->{
		for(int i=0;i<4;i++) {
			inventory.Produce();
		}
		
		
	});
}
}
