package DigitalClock;

import java.time.LocalDateTime;

class DisplayTime {
	LocalDateTime local = LocalDateTime.now();
	  int hr=local.getHour();
	  int min=local.getMinute();
	  int sec=local.getSecond();
	 synchronized public void displayingTime() {
		 try {
			 while(true) {
				 System.out.print("\033[H\033[2J");
			        System.out.flush();
			        System.out.printf("%02d : %02d : %02d ", hr, min, sec);

				 sec++;
				 if(sec==60) {
					 min=min++;
					 sec=0;
				 }
				 if(min==60) {
					 hr=hr+1;
					 min=0;
				 }if(hr==24) {
					 hr=0;
					 min=0;
					 sec=0;
				 }
				 Thread.sleep(1000);
				 System.out.println();
				 System.out.println();
			 }
		 }catch(Exception e) {}
	 }

}
