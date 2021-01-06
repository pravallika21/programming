package pack;
import java.util.*;

public class Timer{
	int hours,seconds,minutes;
	int input;
	Scanner sc = new Scanner(System.in);
	public void secondsToHours(){
		System.out.print("Enter seconds to convert into hours : ");
		input = sc.nextInt(); 
		hours = input/3600;
		System.out.println(input +" seconds equals to "+hours+ " hours");
	}
	
	public void hoursToMinutes(){
		System.out.println("Enter hours to convert into Minutes : ");
		input = sc.nextInt();
		minutes = input*60;
		System.out.println(input +" hours equals to "+minutes + " Minutes");
	}

	public void hoursToSeconds(){
		System.out.println("Enter hours to convert into seconds : ");
		input = sc.nextInt();
		seconds = input*3600 ;
		System.out.println(input +" hours equals to "+seconds  + " seconds ");
	}

	public void minutesToHours(){
		System.out.println("Enter minutes to convert into hours : ");
		input = sc.nextInt();
		hours = input/60;
		System.out.println(input+" minutes equals to "+hours + " hours");
	}
}

		
		










