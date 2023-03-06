package Logistic;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
class Destination{
	public static  int Timetaken(int distance,int speed) {        
		int time;
	time=distance/speed;
	  //System.out.println(time);
	 return time;
		}
	public void Timecalc(int distance,int speed,int time)  {
		LocalDate date=LocalDate.now();
		LocalTime Time=LocalTime.now();
		System.out.println(Time);
		int year=date.getYear();
		int month=date.getMonthValue();
		int dayofmonth=date.getDayOfMonth();
		int dayofyear=date.getDayOfYear();
		String day=date.getDayOfWeek().toString();
		//System.out.println(day);
		int hr=Time.getHour();
		int enddate;
		int DayTravel;
		int i=0;
		while( i<distance) {
			int dist2=speed*8;
			if(dayofyear==1 || dayofyear==26 || dayofyear==227 || day.equals("SUNDAY") || (dayofmonth>7 && dayofmonth<=14)) {
			   
			}if((day.equals("SATURDAY")) && (dayofmonth>7 && dayofmonth<=14 )) {
				}
			else {
				date=date.plusDays(1);
				Time=Time.plusHours(8);
				
			}
			
		
			distance=distance-dist2;
			i=i+dist2;
		}
		System.out.println(date);
		System.out.println(Time);
		
		
	
}
}

