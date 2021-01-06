import java.util.*;
//import java.util.InputMismatch;

public class ExceptionHandiling{
	public static void main(String []args){
		Scanner sai = new Scanner(System.in);
		try{
			System.out.println("enter any two values");
			int a = sai.nextInt();
			int b = sai.nextInt();
			int c ;
			c = a/b;
		}
		catch(ArithmeticException ae){
			System.out.println("Airthmatic exception occured");
		}
		catch(InputMismatchException ie){
			System.out.println("Input mismatch exception occured");
		}
	}
}