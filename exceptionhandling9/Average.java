package exceptionhandling9;

class  Average extends MoreExceptions{
	
	
	public void average(int [] sub) {
		int avg=0;
 
		for(int i=0;i<sub.length;i++) {
			avg=avg+sub[i];
			System.out.println(sub[i]);
		}
		
		System.out.println("The average is"+avg/sub.length);
	}
	}
