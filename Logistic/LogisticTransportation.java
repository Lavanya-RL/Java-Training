package Logistic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class LogisticTransportation {
public static void main(String[] args) {
	System.out.println("Enter the distance in km");
	Scanner scanner=new Scanner(System.in);
	int distance=scanner.nextInt();
	System.out.println("Enter the speed at which it travels in km/hr");
	int speed=scanner.nextInt();
	

	Destination obj1=new Destination();
	int time=obj1.Timetaken(distance, speed);
	obj1.Timecalc(distance,speed,time);                                 //
}
}
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
			if(dayofyear==1 || dayofyear==26 || dayofyear==227 || day.equals("SUNDAY") || day.equals("SATURDAY")) {
			   
			}else {
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
