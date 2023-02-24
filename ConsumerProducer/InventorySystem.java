package ConsumerProducer;
 class InventorySystem {
	 boolean flag=false;
	synchronized  public void Consume() {
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Waiting for producton ");
		flag=true;
		notify();
		
		
	 }
	synchronized  public void Produce() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Ready for Consumption");
		flag=false;
		notify();
		 
	 }

}
