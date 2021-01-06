package pack ;
import java.util.Scanner; 

public class DistanceConverter{
	

	Scanner sai = new Scanner(System.in);
	double km , meter , mile , input ;
		
	public void metersToKm(){
		input = sai.nextDouble();
		km = input*0.001; 
		System.out.println(input +" meters = "+km +" Kilometers");	
	}
		
	public void milesToKm(){
		input = sai.nextDouble();
		km = input*1.609344; 
		System.out.println(input +" miles = "+km +" Kilometers");		
	}

	public void kmToMeters(){
		input = sai.nextDouble();
		meter = input/0.001; 
		System.out.println(input +" Kilometers = "+meter +" meters");		
	}

	public void kmToMiles(){
		input = sai.nextDouble();
		km = input/1.609344; 
		System.out.println(input +" Kilometers = "+ km +" miles");		

	}
	
}