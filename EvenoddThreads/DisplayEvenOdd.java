package EvenoddThreads;
 class DisplayEvenOdd {
	 
	synchronized public void DisplayEven() {
		 for(int i=0;i<=100;i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }else {
				 continue;
			 }
		 }
		 System.out.println();
	 }
	synchronized public void DisplayOdd() {
		 for(int i=0;i<=100;i++) {
			 if(i%2!=0) {
				 System.out.println(i);
			 }else {
				 continue;
			 }
		 }
	 }

}
