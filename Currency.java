package pack;
import java.util.Scanner;

public class Currency{
	
		Scanner sai = new Scanner(System.in);
		double INR, USD , EURO , YEN ;

		public void dollarToRupee(){
			System.out.println("Enter how many dollars to convert into Rupees : ");
			USD = sai.nextDouble();
			INR = USD*73 ;
			System.out.println("Dollar ="+USD+"equal to INR="+INR);
		} 
		
		public void euroToRupee(){
			System.out.println("Enter how many euros to convert into Rupees : ");
			EURO = sai.nextDouble();
			INR = EURO*90 ;
			System.out.println(EURO +"EURO'S Equals to "+INR+"INR");
		}
				
		public void yenToRupee(){
			System.out.println("Enter how many YEN'S to convert into Rupees : ");
			YEN = sai.nextDouble();
			INR = YEN*0.71;
			System.out.println(YEN +"YEN'S Equals to "+INR+"INR");
		}

		public void rupeeToDollar(){
			System.out.println("Enter how many Rupees to convert into dollars : ");
			INR = sai.nextDouble();
			USD = INR/73 ;
			System.out.println("INR ="+INR+"equal to Dollar="+USD);
		} 

		public void rupeeToEuro(){
			System.out.println("Enter Rupees to convert into Euro:");
			INR = sai.nextDouble();
			EURO =(INR/90);
			System.out.println("Rupee ="+INR +"equal to Euro="+EURO);
		} 

		public void rupeeToYen(){
			System.out.println("Enter Rupees to convert into Yen:");
			INR = sai.nextDouble();
			YEN =(INR/0.71);
			System.out.println("INR="+INR +"equal to YEN"+YEN);
		}	
}



