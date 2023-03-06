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
